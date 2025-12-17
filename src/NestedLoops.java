public class NestedLoops {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("           Multiplication Table");
//
//        // Display the number title
//        System.out.print("    ");
//        for (int j = 1; j <= 9; j++)
//            System.out.print("   " + j);
//
//        System.out.println("\n-----------------------------------------");
//
//        // Print table body
//        for (int i = 1; i <= 9; i++) {
//            System.out.print(i + " | ");
//            for (int j = 1; j <= 9; j++) {
//                // Display the product and align properly
//                System.out.printf("%4d", i * j);
//            }
//            System.out.println();
//        }
        for(int i =1; i<=9 ; i++){ //outer loop
            for(int j=1; j<=9; j++){// inner loop
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println("-----------------------");
        }

        // star patterns
        for(int row =1; row <=5; row++){
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int row =5; row >=1; row--){
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
