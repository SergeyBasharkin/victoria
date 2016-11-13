/**
 * Created by sergey on 30.10.16.
 */
public class DubbleArray {
    public static void main(String[] args) {
        int a [][]=new int[6][6];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 1; j <a.length ; j++) {
                a[i][j] = i*a.length+j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
