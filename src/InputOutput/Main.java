package InputOutput;

import NoteBook.Note;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sergey on 18.11.16.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("files/test.txt");
        if (!file.exists()) file.createNewFile();
        Note[] arr = new Note[3];


        try (FileInputStream fin = new FileInputStream(file);
             ObjectInputStream oin = new ObjectInputStream(fin)) {           // Поток для чтения (сериализации) объектов
            while (true) {
                try {
                    arr= (Note[]) oin.readObject();
                    System.out.println(arr);
                } catch (EOFException e) {
                    break;
                }
            }
            System.out.println("END OF FILE");
        }


//        arr[0]=new Note("123","123123");
//        arr[1]=new Note("345","345345");
//        arr[2]=new Note("456","456456");
//        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(file,true));
//        outputStream.writeObject(arr);
//        outputStream.close();
//        ObjectInputStream inputStream = null;
//        try {
//            inputStream = new ObjectInputStream(new FileInputStream(file));
//            arr = (Note[]) inputStream.readObject();
//        } catch (EOFException e) {
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//

    }
}
