package NoteBook;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sergey on 20.11.16.
 */
public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ViewNote viewNote = null;
        try {
            File file = new File("files/test.txt");
            if (!file.exists()) file.createNewFile();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            Note[] arr = (Note[]) inputStream.readObject();
            viewNote = new ViewNote(new Notebook(arr));
        } catch (EOFException e) {
            System.out.println("END OF FILE");
            viewNote = new ViewNote(new Notebook(255));
        }
        Scanner scanner = new Scanner(System.in);
        String fio = "";

        while (true) {
            System.out.println("1-getAll; 2-add; 3-show; 4-delete; 5-save");
            int chose = scanner.nextInt();
            scanner.nextLine();
            switch (chose) {
                case 1:
                    viewNote.getAll();
                    break;
                case 2:
                    viewNote.add();
                    break;
                case 3:
                    System.out.println("Введите ФИО");
                    fio = scanner.nextLine();
                    viewNote.show(fio);
                    break;
                case 4:
                    System.out.println("Введите ФИО");
                    fio = scanner.nextLine();
                    System.out.println(viewNote.delete(fio));
                    break;
                case 5:
                    if (viewNote.save(new File("files/test.txt"))){
                        System.out.println("успех");
                    }else {
                        System.out.println("неудача");
                    }
            }
        }

    }
}
