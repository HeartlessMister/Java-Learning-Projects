import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Patient> emergentService = new PriorityQueue<>();

        emergentService.offer(new Patient("Ali", "scald"));
        emergentService.offer(new Patient("Okan", "headache"));
        emergentService.offer(new Patient("Mehmet", "headache"));
        emergentService.offer(new Patient("Simay", "appendicitis"));
        emergentService.offer(new Patient("Sami", "scald"));
        emergentService.offer(new Patient("Selen", "scald"));
        emergentService.offer(new Patient("Selin", "scald"));

        int temp = 1;

        while (!emergentService.isEmpty()){
            System.out.println(temp +". person");
            System.out.println(emergentService.poll());
            System.out.println("*****************");
            temp++;

        }
    }


}
