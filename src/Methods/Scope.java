package Methods;

public class Scope {
   //static String message="java";
    static void main() {
       // String message = "Welcome to java";
        //System.out.println(message);
        display();
    }
   static void display(){
        String message = "Welcome to java";
        int i=0;
        for( i=1; i<=2; i++){
            System.out.println(message);
        }
    }
   
}
