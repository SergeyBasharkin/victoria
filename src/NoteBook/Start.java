package NoteBook;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by sergey on 20.11.16.
 */
public class Start {
    public static void main(String[] args) {
        ViewNote viewNote=new ViewNote(new Notebook(255));
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1-getAll; 2-create; 3-show;");
            int chose=scanner.nextInt();
            switch (chose){
                case 1: viewNote.getAll();
                    break;
                case 2: viewNote.create();
                    break;
                case 3:
                    System.out.println("Введите ФИО");
                    String fio=scanner.nextLine();
                    viewNote.show(fio);
                    break;
            }
        }


    }
}
