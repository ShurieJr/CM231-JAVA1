public class BraekContinue {
    static void main() {
        for(int i=1; i<=10; i++){
            if(i==6 )
                break;
            System.out.println(i);
        }
        for(int i=1; i<=10; i++){
            if(i==6 || i==7)
                continue;
            System.out.println(i);
        }
    }
}
