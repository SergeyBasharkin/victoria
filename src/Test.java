import schoolSimulator.Course;
import schoolSimulator.FirstCourse;
import schoolSimulator.Student;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by sergey on 04.11.16.
 */
public class Test {
    public static void main(String[] args) {



        Course course=new FirstCourse();

        int []n=new int[10];
        for (int i = 1; i <=n.length ; i++) {
            n[i-1]=i;
        }
        int []a=new int[11];
        a= Arrays.copyOf(n,a.length);

        a[10]=12;
        for (int i = 0; i < 11; i++) {
            System.out.println(a[i]);
        }
        System.out.println(a.length);
    }
}
