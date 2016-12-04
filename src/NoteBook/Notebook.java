package NoteBook;

/**
 * Created by sergey on 20.11.16.
 */
public class Notebook implements INoteBook {


    private Note[] notes;
    private int size;

    public Notebook(int size) {
        notes=new Note[size];
        size=0;
    }

    public Notebook(Note[] notes) {
        this.notes = notes;
        size=notes.length;
    }

    public Notebook() {
        notes=new Note[3];
        size=3;
    }

    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    @Override
    public String add(Note note) {
        int i=0;
        while (notes[i]!=null&& i<notes.length){
            i++;
        }
        notes[i]=note;
        size++;
        return "Note created";
    }

    @Override
    public String delete(Note note) {
        boolean isDeleted=false;
        for (int i = 0; i <size() ; i++) {
            if ( note.getFio().equals(notes[i].getFio())){
                notes[i]=null;
                isDeleted=true;
                size--;
                for (int j = i; j <size() ; j++) {
                    notes[j]=notes[j+1];
                }
                notes[size]=null;
            }
        }
        if (isDeleted) {
            return "Note " + note + " deleted";
        }else {
            return "not deleted";
        }
    }

    @Override
    public String update(Note note) {

        return null;
    }

    @Override
    public int size(){
        return size;
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
        for (int i = 0; i <size() ; i++) {
            if(notes[i].getFio().equals(fio)){
                return notes[i];
            }
        }
        return null;
    }

    @Override
    public Note findByNumber(String number) {
        return null;
    }
}
