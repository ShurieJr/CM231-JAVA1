import java.util.Scanner;

public class guessNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
        System.out.println("Guess the number :");
        int guessNumber = input.nextInt();

        while (guessNumber != randomNumber) {
            if (guessNumber > randomNumber)
                System.out.println("too high");
            else
                System.out.println("too low");
            System.out.println("Try again! Guess the number :");
             guessNumber = input.nextInt();
        }
        if (guessNumber == randomNumber)
            System.out.println("Congratulations!");
    }
}
