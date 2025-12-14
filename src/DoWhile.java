public class DoWhile {
    static void main() {
        //output 10 - 1
        int counter = 1;
        //post test loop
        do{
            System.out.println(counter);
            counter++;
        }while (counter <= 10);
        //while loop
//        while (counter <= 10){
//            System.out.println(counter);
//            counter++;  //2
//        }


        int age = 30;
        System.out.println(age--);  //29
        System.out.println(age);  //29
    }
}
