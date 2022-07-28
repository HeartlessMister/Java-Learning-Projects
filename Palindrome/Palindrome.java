//Palindrome by using Stack method, this is an original solution

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word, if you write a sentence, first word will be taken.");

        String word = scanner.next();
        
        Stack<Character> stack = new Stack<>();
        int var = 0;
        for(Character temp: word.toCharArray()){
            stack.add(temp);
        }
        for(Character temp: word.toCharArray()){

            if (stack.pop().equals(temp)){

                var +=1;
                if (var == word.length()){
                    System.out.println("The word is a Palindrome");
                }


            }else {
                System.out.println("The word is not a Palindrome" );
                break;
            }

        }

    }


    
    



}
