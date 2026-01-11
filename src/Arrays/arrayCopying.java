package Arrays;

import java.util.Arrays;

public class arrayCopying {
    static void main() {
        int[]  source= {20 ,30 , 40 ,90};
        int[] target= new  int[source.length];

        //assignment operator =
//        target = source;
        //loop
//        for(int i=0; i<source.length; i++){
//            target[i] = source[i];
//        }

        //arraycopy
        System.arraycopy(source , 0 , target , 0 , source.length);
        target[0] = 60;
        System.out.println("source: " + Arrays.toString(source));
        System.out.println("target: " +Arrays.toString(target));
    }
}
