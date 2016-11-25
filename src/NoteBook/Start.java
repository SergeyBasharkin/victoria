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
        String fio="";
        while (true){
            System.out.println("1-getAll; 2-add; 3-show; 4-delete;");
            int chose=scanner.nextInt();
            scanner.nextLine();
            switch (chose){
                case 1: viewNote.getAll();
                    break;
                case 2: viewNote.add();
                    break;
                case 3:
                    System.out.println("Введите ФИО");
                    fio=scanner.nextLine();
                    viewNote.show(fio);
                    break;
                case 4:
                    System.out.println("Введите ФИО");
                    fio=scanner.nextLine();
                    System.out.println(viewNote.delete(fio));
                    break;

            }
        }


    }
}
