/**
 * Created by sergey on 30.10.16.
 */
public class Fibonachi {
    public static void main(String[] args) {
        int a=12;
        int fibonachiHead=1;
        int fibonachiTail=1;
        int nextFibonachi=0;
        while (a>nextFibonachi) {
            nextFibonachi=fibonachiHead+fibonachiTail;

            if (nextFibonachi >= a) {
                boolean fibonachiClose = nextFibonachi - a < a - fibonachiTail;
                System.out.println(fibonachiClose ? nextFibonachi : fibonachiTail);
            }
            fibonachiHead = fibonachiTail;
            fibonachiTail = nextFibonachi;
        }
    }
}
