import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static String calculateLetterGrade(String name, int midtermOne, int midtermTwo, int finalGrade) {


        double totalGrade = ((3.0 / 10.0) * (midtermOne + midtermTwo) + (finalGrade * 4.0 / 10.0));

        String output;

        if (totalGrade >= 90) {

            output = (name + " congratulations, you got A");

        } else if (totalGrade >= 85) {
            output =(name + " congratulations, you got A-");

        } else if (totalGrade >= 80) {
            output =(name + " congratulations, you got B+");
        } else if (totalGrade >= 75) {
            output = (name + " congratulations, you got B");
        } else if (totalGrade >= 70) {
            output =(name + " congratulations, you got B-");
        } else if (totalGrade >= 65) {
            output =(name + " got C+");
        } else if (totalGrade >= 60) {
            output =(name + " got C");
        } else if (totalGrade >= 55) {
            output =(name + " got C-");
        } else if (totalGrade >= 50) {
            output =(name + " got D+");
        } else if (totalGrade >= 45) {
            output =(name + " got D");
        } else {
            output =(name + " have failed the course");
        }
        return output;
    }


    public static void main(String[] args) {


        try(Scanner scanner = new Scanner(new FileReader("C:\\Users\\yunus\\IdeaProjects\\Education\\src\\file.txt"));
            FileWriter writer = new FileWriter("src/letterGrades.txt")){
            while (scanner.hasNextLine()){
                String studentInformation = scanner.nextLine();
                String[] studentInfo = studentInformation.split(",");
                String name = studentInfo[0];
                int midtermOne = Integer.valueOf(studentInfo[1]);
                int midtermTwo = Integer.valueOf(studentInfo[2]);
                int finalGrade = Integer.valueOf(studentInfo[3]);


                writer.write(calculateLetterGrade(name, midtermOne, midtermTwo, finalGrade) +" \n");

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
