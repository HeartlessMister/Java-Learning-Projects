import java.io.*;

public class SaveGame {

    public static void saveGame(Card[][] cards){

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.bin"))){
            System.out.println("Game is saving...");

            out.writeObject(cards);

    } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static Card[][] returnSave(){

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"))){

            System.out.println("Turning back to save...");

            Card[][] cards = (Card[][]) in.readObject();

        return cards;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
