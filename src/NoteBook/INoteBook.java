package NoteBook;

/**
 * Created by sergey on 20.11.16.
 */
public interface INoteBook {
    String  add(Note note);
    String delete(Note note);
    int size();
    String update(Note note);
    Note show(Note note);
    Note[] getAll();
    Note findByName(String fio);
    Note findByNumber(String number);

}