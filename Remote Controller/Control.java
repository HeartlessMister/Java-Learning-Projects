import java.util.ArrayList;
import java.util.Iterator;

public class Control implements Iterable<String>{
    private ArrayList<String> channels = new ArrayList<>();

    public class ControlIterator implements Iterator<String>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index >= channels.size()){
                return false;
            } else {
            return true;
        }
        }

        @Override
        public String next() {
            String channel = channels.get(index);
            index++;
            return channel;
        }
    }

    public void addChannel(String channel){

        channels.add(channel);

    }
    public void deleteChannel(String channel){

        channels.remove(channel);
    }
    public int channelNumber(){

        return channels.size();

    }

    @Override
    public Iterator<String> iterator() {
        return new ControlIterator();
    }


}
