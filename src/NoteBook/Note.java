package NoteBook;

import java.util.Date;

/**
 * Created by sergey on 20.11.16.
 */
public class Note {
    private String fio;
    private String number;
    private Date birthday;

    public Note(String fio) {
        this.fio = fio;
    }

    public Note(String fio, String number, Date birthday) {
        this.fio = fio;
        this.number = number;
        this.birthday = birthday;
    }

    public Note(String fio, String number) {
        this.fio = fio;
        this.number = number;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Note{" +
                "fio='" + fio + '\'' +
                ", number='" + number + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
