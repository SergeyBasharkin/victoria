package NoteBook;

import java.text.SimpleDateFormat;
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

    public void create() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ФИО");
        String fio=scanner.nextLine();
        System.out.println("Введите номер");
        String number=scanner.nextLine();
        Note note=new Note(fio,number);
        String result=notebook.create(note);
        System.out.println(result);
    }

    public String delete(Note note) {

        return null;
    }

    public String update(Note note) {

        return null;
    }

    public void show(String fio) {
        Note note=findByName(fio);
        System.out.print("ФИО: "+ note.getFio()+"\n"
        +"Номер: "+note.getNumber()+"\n"
        +"День Рождения: "+ note.getBirthday()+"\n");

    }

    public void getAll() {
        Note[] notes=notebook.getAll();
        int i=0;
        while (i<notes.length && notes[i]!=null){

            System.out.println(notes[i]);
            i++;
        }
    }

    public Note findByName(String fio) {
        return new Note("Frank","+755522301");
    }

    public Note findByNumber(String number) {
        return null;
    }
}
