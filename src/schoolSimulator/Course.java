package schoolSimulator;

/**
 * Created by sergey on 13.11.16.
 */
public abstract class Course {
    protected int progress;
    protected int communication;
    protected int food;

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
