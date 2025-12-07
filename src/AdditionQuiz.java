import java.util.Scanner;

public class AdditionQuiz {
    static void main() {
        Scanner input = new Scanner(System.in);
        //two random numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
    //question
        System.out.println("What is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();
        while(answer != (number1 + number2)){
            System.out.println("Wrong Answer! plz try again!");
        answer = input.nextInt();
        }
        System.out.println("Correct! Bravo");

//        if(answer == (number1 + number2))
//            System.out.println("Correct!");
//        else
//            System.out.println("Wrong answer");
    }
}
