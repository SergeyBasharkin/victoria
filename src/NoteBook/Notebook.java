package NoteBook;

/**
 * Created by sergey on 20.11.16.
 */
public class Notebook implements INoteBook {


    private Note[] notes;

    public Notebook(int size) {
        notes=new Note[size];
    }

    @Override
    public String create(Note note) {
        int i=0;
        while (notes[i]!=null&& i<notes.length){
            i++;
        }
        notes[i]=note;

        return "Note created";
    }

    @Override
    public String delete(Note note) {

        return null;
    }

    @Override
    public String update(Note note) {

        return null;
    }

    @Override
    public Note show(Note note) {
        return null;
    }

    @Override
    public Note[] getAll() {
        return notes;
    }

    @Override
    public Note findByName(String fio) {
        return null;
    }

    @Override
    public Note findByNumber(String number) {
        return null;
    }
}
