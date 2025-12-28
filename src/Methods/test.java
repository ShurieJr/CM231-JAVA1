package Methods;

public class test {
    static void main() {
        int x=9 ;
        int y=40;
        int maxNumber = max(x , y);
       // System.out.println("Max: " + maxNumber );

//     display(3); //actual arguments
//     display(1);

//        System.out.println(sign(-9));
        test();
        test(1 , 2.0);
    }

    //max
    static int max(int num1 , int num2){ //formal arguments
      int result=0;
      if(num1 > num2)
          result = num1;
      else
          result = num2;
      return result;
    }

    //print "welcome to cm231" 10 times
    static void display(int times){
        for(int i=0; i<times; i++)
            System.out.println("Welcome to CM231");
    }

    //sign method
    static int sign(int number){
        if(number > 0)
            return 1;
        else if(number == 0)
            return 0;
        else
            return -1;
    }

    //method overloading
    static void test(){
        System.out.println("testing...");
    }
    static void test(int number , double number2){
        System.out.println(number);
    }
    static void test(double number , int number2){
        System.out.println(number);
    }
}
