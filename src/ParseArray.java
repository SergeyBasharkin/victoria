import java.util.Random;

/**
 * Created by sergey on 04.11.16.
 */
public class ParseArray {
    public static void main(String[] args) {
        int [][] mas = new int [5][5];
        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas.length ; j++) {
                mas [i][j]= i*mas.length +j;

            }

        }
        int [] mas1 = new int[mas.length*mas.length];

        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas.length ; j++) {
                mas1[i*mas.length+j]=mas[i][j];

            }
        }
        print2(mas);
        System.out.println();
        print(mas1);

    }

    public static void print(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void print2(int arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
