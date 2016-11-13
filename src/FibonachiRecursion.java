/**
 * Created by sergey on 30.10.16.
 */
public class FibonachiRecursion {
    public static void main(String[] args) {
        System.out.println(fibonachi(7));

    }

    public static int fibonachi(int n) {
         if ( n==0 || n==1){
             return 1;
         }
        int result = fibonachi(n-1)+ fibonachi(n-2);
        return result;

    }
}
