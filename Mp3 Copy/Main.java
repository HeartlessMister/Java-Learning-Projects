import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> content = new ArrayList<>();


    public static void readFile(){

        try {
            FileInputStream in = new FileInputStream("can.mp3");
            int read;

            while ((read = in.read()) != -1){

                content.add(read);



            }
            in.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void copyFile (String filename){

        try {
            FileOutputStream out = new FileOutputStream(filename);

            for (int value: content){

                out.write(value);
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        readFile();
        long start = System.currentTimeMillis();

        copyFile("can3.mp3");

        long finish = System.currentTimeMillis();

        System.out.println("File copy time: " + (finish-start) + " miliseconds");


    }
}
