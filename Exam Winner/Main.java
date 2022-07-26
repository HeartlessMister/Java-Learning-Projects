import java.util.Scanner;

// You cannot directly exit from the program, you need to enter values first

public class Main {
    public static void main(String[] args) {
        firstPlace();
    }

    public static void firstPlace() {

        System.out.println("This program finds who is the rank1 student.");

        Scanner scanner = new Scanner(System.in);

        String operations = "Operations: \n" +
                "1. Find Tm rank1\n" +
                "2. Find Mf rank1";
        System.out.println("***********************");
        System.out.println(operations);
        System.out.println("***********************");

        System.out.println("First Candidate name: ");
        String studentName1 = scanner.nextLine();
        System.out.println("Number of correct answer:(Turkish, Mathematics, Biology, Chemistry, Physics, English,Literature,Geography,History ");
        int turkish1 = scanner.nextInt();
        int mathematics1 = scanner.nextInt();
        int english1 = scanner.nextInt();
        int biology1 = scanner.nextInt();
        int chemistry1 = scanner.nextInt();
        int physics1 = scanner.nextInt();
        int literature1 = scanner.nextInt();
        int geography1 = scanner.nextInt();
        int history1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Second Candidate name: ");
        String studentName2 = scanner.nextLine();
        System.out.println("Number of correct answer:(Turkish, Mathematics, Biology, Chemistry, Physics, English,Literature,Geography,History ");
        int turkish2 = scanner.nextInt();
        int mathematics2 = scanner.nextInt();
        int english2 = scanner.nextInt();
        int biology2 = scanner.nextInt();
        int chemistry2 = scanner.nextInt();
        int physics2 = scanner.nextInt();
        int literature2 = scanner.nextInt();
        int geography2 = scanner.nextInt();
        int history2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Third Candidate name: ");
        String studentName3 = scanner.nextLine();
        System.out.println("Number of correct answer:(Turkish, Mathematics, Biology, Chemistry, Physics, English,Literature,Geography,History ");
        int turkish3 = scanner.nextInt();
        int mathematics3 = scanner.nextInt();
        int english3 = scanner.nextInt();
        int biology3 = scanner.nextInt();
        int chemistry3 = scanner.nextInt();
        int physics3 = scanner.nextInt();
        int literature3 = scanner.nextInt();
        int geography3 = scanner.nextInt();
        int history3 = scanner.nextInt();
        scanner.nextLine();

        while (true) {
            System.out.println("Please enter the operation: ");
            System.out.println(operations);
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Program is closing...");
                break;

            } else if (operation.equals("1")) {
                Tm Student1 = new Tm(studentName1, turkish1,  mathematics1,  biology1,  chemistry1,  physics1, english1, literature1,  geography1, history1);
                Tm Student2 = new Tm(studentName2, turkish2,  mathematics2,  biology2,  chemistry2,  physics2, english2, literature2,  geography2, history2);
                Tm Student3 = new Tm(studentName3, turkish3,  mathematics3,  biology3,  chemistry3,  physics3, english3, literature3,  geography3, history3);

                System.out.println("First student is: "+ First(Student1,Student2,Student3).getName());
                System.out.println("First student point is:"+ First(Student1,Student2,Student3).calculatePoint());


            } else if (operation.equals("2")) {
                System.out.println("Candidate name: ");
                Mf Student1 = new Mf(studentName1, turkish1,  mathematics1,  biology1,  chemistry1,  physics1, english1, literature1,  geography1, history1);
                Mf Student2 = new Mf(studentName2, turkish2,  mathematics2,  biology2,  chemistry2,  physics2, english2, literature2,  geography2, history2);
                Mf Student3 = new Mf(studentName3, turkish3,  mathematics3,  biology3,  chemistry3,  physics3, english3, literature3,  geography3, history3);
                System.out.println("First student is: "+ First(Student1,Student2,Student3).getName());
                System.out.println("First student point is:"+ First(Student1,Student2,Student3).calculatePoint());
                continue;
            }else {
                System.out.println("Wrong Operation");}

        }
    }

    public static <E extends Candidate> E First(E e1, E e2, E e3) {

        if (e1.calculatePoint() > e2.calculatePoint() && e1.calculatePoint() > e2.calculatePoint()) {

            return e1;
        } else if ((e2.calculatePoint() > e1.calculatePoint() && e2.calculatePoint() > e3.calculatePoint())) {
            return e2;
        } else {
            return e3;
        }
    }


}

