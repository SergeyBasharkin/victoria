package schoolSimulator;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by sergey on 13.11.16.
 */
public abstract class Student {
    protected int progress;
    protected int communication;
    protected int subCommunication;
    protected int food;
    protected Friends friends;
    protected int currentCourse;

    public Student() {
        this.progress = 6;
        this.communication = 1;
        this.subCommunication = 6;
        this.food = 6;
        this.friends = new Friends();
        this.studentCourse = new FirstCourse();
        currentCourse=0;
    }

    protected Course studentCourse;

    public int fillProgress(){
        progress+=studentCourse.getProgress();
        if (progress>10){
            progress=10;
        }
        return progress;
    }


    public int fillCommunication(){
        int sumCommunication=0;
        for (int i = 0; i <friends.friendsSize() ; i++) {
            sumCommunication+=friends.get(i).communication;
        }
        communication=sumCommunication/friends.friendsSize()+friends.friendsSize()/10;

        return communication;
    }
    public int fillSubCommunication(){
        subCommunication+=studentCourse.communication;
        if (subCommunication>10){
            friends.addFriend(new Friend(new Random().nextInt(11)));
        }
        return subCommunication;
    }

    public int fillFood(){
        food+=studentCourse.getFood();
        if (food>10){
            food=10;
        }
        return food;
    }

    public int removeSubCommunication(){
        subCommunication-=studentCourse.communication;
        if (subCommunication<0){
            friends.deleteFriend(new Random().nextInt(friends.friendsSize()));
        }
        return subCommunication;
    }
    public int removeFood(){
        food-=studentCourse.getFood();
        if (food<0){
            food=0;
        }
        return food;
    }
    public int removeProgress(){
        progress-=studentCourse.getProgress();
        if (progress<0){
            progress=0;
        }
        return progress;
    }


    public void setFriends(Friends friends) {
        this.friends = friends;
    }

    public void setStudentCourse(Course studentCourse) {
        this.studentCourse = studentCourse;
    }
}
