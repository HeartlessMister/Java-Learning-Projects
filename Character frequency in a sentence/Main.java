import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        //Using TreeMap, finding characters frequency in a string.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();
        Map<Character, Integer> frequency = new TreeMap<>(); //Diamond operation new feature

        for (int i = 0; i<sentence.length(); i++) {
             char c = sentence.charAt(i);

             if (frequency.containsKey(c)){

                 frequency.replace(c, frequency.get(c) + 1);
             }else {
                 frequency.put(c, 1);
             }
        }


        for (Map.Entry<Character, Integer> entry: frequency.entrySet()){
             System.out.println("Character: '" + entry.getKey() +" 'Frequency: "+ entry.getValue());



        }


    }

}

