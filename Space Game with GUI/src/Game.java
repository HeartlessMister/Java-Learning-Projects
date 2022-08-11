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



class Fire {
    private int x;
    private int y;

    public Fire(int x, int y) {
        this.x = x;
        this.y = y;
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

    private int fireDirY =5;

    private int targetX = 0;

    private int targetDirX = 5;

    private int spaceShuttleX = 0;

    private int spaceShuttleDirX = 20;

    public boolean check(){

        for (Fire fire: fireList){

            if (new Rectangle(fire.getX(), fire.getY(), 5, 10).intersects(new Rectangle(targetX, 0, 20, 20))){

                return true;
            }
        }
        return false;



    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        time+= 5;
        g.setColor(Color.red);
        g.fillOval(targetX,0,20,20);
        g.drawImage(image, spaceShuttleX, 600, image.getWidth()/10, image.getHeight()/10,
                this);

        g.setColor(Color.BLUE);

        for(Fire fire: fireList){

            g.fillRect(fire.getX(), fire.getY(), 5,10);

        }
        //throws ConcurrentModificationException --> There is a break inside the for loop to avoid interfering with the for loop

         for (Fire fire: fireList){
            if(fire.getY()<0){
                fireList.remove(fire);
                break;
            }}

         if (check()){
             timer.stop();
             String message = "Congratulations, you have won\n" +
                     "You have spend "+ numberofFire +" bullets\n" +
                     "Time: "+ time+" ms";
             JOptionPane.showMessageDialog(this, message);
             System.exit(0);
         }


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

        }
        if (x == KeyEvent.VK_SPACE){

            fireList.add(new Fire(spaceShuttleX +17,600));
            numberofFire++;


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
