package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];

        //random numbers
//        for(int i=0; i< marks.length; i++){
//            marks[i] = (int) (Math.random()*100);
//        }
        //ask the to enter marks
        System.out.println("Enter " + marks.length + " marks:");
        for(int i=0; i< marks.length; i++){
            System.out.println("Subject " + (i+1) + " : ");
            marks[i] = input.nextInt();
        }
        //printing array elements
        System.out.println("Marks:------");
//        for(int i=0; i< marks.length; i++){
//            System.out.println(marks[i]);
//        }
        for(int value: marks){
            System.out.println(value);
        }
        //total
        int total = 0;
//        for(int i=0; i< marks.length; i++){
//            total += marks[i];
//        }
        for(int value: marks){
            total += value;
        }
        System.out.println("Total : " + total);
        System.out.println("Avg: " + (total / marks.length) + "%");
    //max element
        int max = marks[0];
        for(int i=1; i<marks.length; i++){
            if(marks[i] > max)
                max= marks[i];
        }
        System.out.println("Max: " + max);
        //min elemenet
        int min = marks[0];
        for(int i=1; i<marks.length; i++){
            if(marks[i] < min)
                min= marks[i];
        }
        System.out.println("Min: " + min);
        //shifting
        int temp = marks[0];
        for(int i=1; i<marks.length; i++){
            marks[i-1] = marks[i];
        }
        marks[marks.length-1] = temp;
        System.out.println(Arrays.toString(marks));
    }
}
