package NoteBook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by sergey on 20.11.16.
 */
public class ViewNote {

    INoteBook notebook;

    public ViewNote(INoteBook notebook) {
        this.notebook = notebook;
    }
    public boolean save(File file) throws IOException {
        ObjectOutputStream outputStream= null;
        Note [] notes= Arrays.copyOfRange(notebook.getNotes(),0,notebook.size());
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(notes);
            outputStream.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void add() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ФИО");
        String fio=scanner.nextLine();
        System.out.println("Введите номер");
        String number=scanner.nextLine();
        Note note=new Note(fio,number);
        String result=notebook.add(note);
        System.out.println(result);
    }

    public String delete(String fio) {
        Note note = new Note(fio);
        return notebook.delete(note);
    }

    public String update(Note note) {

        return null;
    }

    public void show(String fio) {
        System.out.println(findByName(fio));
    }

    public void getAll() {
        Note[] notes=notebook.getAll();
        for (int i = 0; i <notebook.size() ; i++) {
            System.out.println(notes[i]);
        }
//        int i=0;
//        while (i<notes.length && notes[i]!=null){
//
//            System.out.println(notes[i]);
//            i++;
//        }
    }

    public String findByName(String fio) {

        return notebook.findByName(fio).toString();
    }

    public Note findByNumber(String number) {
        return null;
    }
}
