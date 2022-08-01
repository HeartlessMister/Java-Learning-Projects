import java.io.File;
import java.util.Scanner;


// If you select the same letter, in the same position there is a bug occurs. adding && deepEquals(Object[], Object[] comparison can solve the problem).

public class Main {
    private static Card[][] cards = new Card[4][4];


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        startSavedFile();


        while (isGameOver() == false) {

            gameBoard();
            System.out.println("Do you want to exit (y/n)");
            String exit = scanner.nextLine();
            if (exit.equals("y")) {
                System.out.println("Do you want to save the game? (y/n)");
                String save = scanner.nextLine();
                if (save.equals("y")) {
                    SaveGame.saveGame(cards);
                    System.out.println("Game is saved, game is closing...");
                    break;

                }
                System.out.println("Game is lost, game is closing...");
                break;
            }
            guessOne();


        }
        ;
    }

    public static void startSavedFile(){
        File file = new File("save.bin");
        System.out.println("You have a saved game file. Do you want to continue from the saved game? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String exit = scanner.nextLine();
        if (file.exists()){
            if(exit.equals("y") ) {

                cards = SaveGame.returnSave();
                return;
            }

        }
        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('E');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');


    }








    public static void guessOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Guess (enter i and j values with one space");

        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        cards[i1][j1].setGuess(true);
        gameBoard();

        System.out.println("First Guess (enter i and j values with one space");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();


        if (cards[i1][j1].getValue() == cards[i2][j2].getValue()) {

            cards[i1][j1].setGuess(true);
            cards[i2][j2].setGuess(true);

            gameBoard();
        } else {
            cards[i1][j1].setGuess(false);

        }


    }

    public static boolean isGameOver() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (cards[i][j].isGuess() == false) {
                    return false;
                }

            }

        }
        return true;
    }

    public static void gameBoard() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (cards[i][j].isGuess()) {
                    System.out.print(" |" + cards[i][j].getValue() + "| ");
                } else {
                    System.out.print(" | " + " | ");

                }


            }
            System.out.println("");
            System.out.println("-------------------------");
        }


    }


}