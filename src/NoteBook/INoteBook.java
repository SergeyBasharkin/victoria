package NoteBook;

/**
 * Created by sergey on 20.11.16.
 */
public interface INoteBook {
    String  create(Note note);
    String delete(Note note);
    String update(Note note);
    Note show(Note note);
    Note[] getAll();
    Note findByName(String fio);
    Note findByNumber(String number);

}