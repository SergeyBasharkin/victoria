package schoolSimulator;

/**
 * Created by sergey on 13.11.16.
 */
public class MyStudent extends Student{

    public boolean nextCourse(Course course){
        if(communication==10 && food==10 && progress==10){
            studentCourse=course;
            return true;
        }
        return false;
    }

    public boolean isAlive(){
        if(communication<=0 || food<=0 || progress<=0 || friends.friendsSize()<=0){
            return false;
        }
        return true;
    }
}
