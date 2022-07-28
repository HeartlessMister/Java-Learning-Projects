import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramadan Pita Bread Queue: ");

        Random random = new Random();

        Queue<String> pitaQueue = new LinkedList<>();
        pitaQueue.offer("Ali");
        pitaQueue.offer("Hasan");
        pitaQueue.offer("Ahmet");
        pitaQueue.offer("Hana");
        pitaQueue.offer("Aral");
        pitaQueue.offer("Selim");
        pitaQueue.offer("Ahmet");
        pitaQueue.offer("Faruk");
        pitaQueue.offer("Serif");
        pitaQueue.offer("Barbaros");
        pitaQueue.offer("Veli");

        int pitaNumber = 1 + random.nextInt(10);
        System.out.println("Pita breads are preparing... ");
        System.out.println("Number of Pita available: " +pitaNumber);

        while (pitaNumber != 0){

            System.out.println(pitaQueue.poll() + " took his pita.");
            pitaNumber--;
            Thread.sleep(1000);
        }

        System.out.println("There is no pita bread left. ");
    }
}
