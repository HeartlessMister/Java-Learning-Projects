import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//This game has not finished yet

class Fire {
    private int x;
    private int y;

    public Fire(int i, int i1) {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }




}
public class Game extends JPanel implements KeyListener, ActionListener{
    Timer timer = new Timer(1, this);
    private int time = 0;
    private int numberofFire = 0;

    private BufferedImage image;

    private ArrayList<Fire> fireList = new ArrayList<>();

    private int fireDirY =1;

    private int targetX = 0;

    private int targetDirX = 5;

    private int spaceShuttleX = 0;

    private int spaceShuttleDirX = 20;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.fillOval(targetX,0,20,20);
        g.drawImage(image, spaceShuttleX, 600, image.getWidth()/10, image.getHeight()/10,
                this);

        g.setColor(Color.BLUE);

        for(Fire fire: fireList){

            g.fillRect(fire.getX(), fire.getY(), 50,30);

        }

        //throws ConcurrentModificationException --> There is a break inside the for loop to avoid interfering with the for loop

         for (Fire fire: fireList){
            if(fire.getY()<0){
                fireList.remove(fire);
                break;
            }}

    }

    @Override
    public void repaint() {
        super.repaint();
    }

    public Game(){

        try {
            image = ImageIO.read(new FileImageInputStream(new File("SpaceShuttle.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBackground(Color.BLACK);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (Fire fire: fireList){
            fire.setY(fire.getY()-fireDirY);
        }

        targetX += targetDirX;

        if(targetX >= 750){
            targetDirX = -targetDirX;}

        if (targetX <= 0){
            targetDirX = -targetDirX;
        }


        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = e.getKeyCode();

        if (x == KeyEvent.VK_LEFT ){
            if (spaceShuttleX<= 0){
                spaceShuttleX = 0;
            }
            else {

                spaceShuttleX -= spaceShuttleDirX;

            }
        } else if (x == KeyEvent.VK_RIGHT ){

            if (spaceShuttleX>= 720){
                spaceShuttleX = 720;
            }
            else {
                spaceShuttleX += spaceShuttleDirX;
            }

        }else if (x == KeyEvent.VK_SPACE){

            fireList.add(new Fire(spaceShuttleX+15,625));
            numberofFire++;


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
