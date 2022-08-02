import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    Random random = new Random();



    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce(){

        while(true){
            try {Thread.sleep(1000);
            Integer value = random.nextInt(100);
            System.out.println("Producer is producing: "+ value);
            queue.put(value);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    public void consume(){
        while(true){
            try {Thread.sleep(5000);
                Integer value = queue.take();
                System.out.println("Consumer is consuming: "+ value);
                System.out.println("Queue size: "+queue.size());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
