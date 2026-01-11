package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class charArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        char[] letters = new char[100];
        //random characters

        for(int i=0; i< letters.length; i++){
            letters[i] =(char) ('a' + Math.random()*26);
        }
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        System.out.println("Enter search letter:");
        char search = input.next().charAt(0);
        int counter = 0;
        for(int i=0; i<letters.length; i++){
            if(search == letters[i])
                counter++;
        }
        System.out.println("Counter: " + counter);
    }
}
