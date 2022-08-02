import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

    Random random = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<>();
    private int limit = 10;


    public void produce(){

        while(true){
            try {
                Thread.sleep(1000);
                synchronized (lock){

                    if(queue.size() == limit){
                        lock.wait();
                    }

                    Integer value = random.nextInt(100);

                    queue.offer(value);

                    System.out.println("Producer is producing: "+ value);

                    lock.notify();

                }


            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    public void consume(){
        while(true){
            try {
                Thread.sleep(2000);

                synchronized (lock){
                    if (queue.size() == 0) {
                        lock.wait();

                    }

                Integer value = queue.poll();
                System.out.println("Consumer is consuming: "+ value);
                System.out.println("Queue size: "+queue.size());
                lock.notify();

                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
