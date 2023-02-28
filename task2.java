// Write a program that takes a 
// string input from the user and prints the number of vowels in the string.

package leetcode;
import java.util.Scanner;

public class task2 {
    public static int vowels(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a word: ");
        String word = sc.nextLine();
        sc.close();
        String[] wordArr = word.split("");
        int count = 0;
        String[] vocals = {"e", "y", "u", "i", "o", "a"};
        for (int i = 0; i < wordArr.length; i++) {
            for (int j = 0; j < vocals.length; j++) {
                if(wordArr[i].equalsIgnoreCase(vocals[j])){
                    count += 1;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
       System.out.println(vowels());
    }
}