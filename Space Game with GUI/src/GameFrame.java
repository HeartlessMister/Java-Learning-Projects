import javax.swing.JFrame;
import java.awt.*;

//This game has not finished yet

public class GameFrame extends JFrame{

    public GameFrame(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {

        GameFrame frame = new GameFrame("Space Game");
        frame.setResizable(false);
        frame.setFocusable(false);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();

        game.requestFocus();

        game.addKeyListener(game);

        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);

        frame.add(game);

        frame.setVisible(true);


    }
}
