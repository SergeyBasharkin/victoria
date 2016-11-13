import java.util.StringJoiner;

/**
 * Created by sergey on 30.10.16.
 */
public class StringArray {
    public static void main(String[] args) {
        String array = "asdf";
        String result = "";
        for (int i = 0; i < array.length()-1; i++) {
            for (int j = i+1; j <array.length()  ; j++) {
                result += array.charAt(i)+""+ array.charAt(j)+" ";

            }
        }
        System.out.println(result);
    }
}
