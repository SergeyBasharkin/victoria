package schoolSimulator;

import java.util.Arrays;

/**
 * Created by sergey on 13.11.16.
 */
public class Friends {

    private Student[] friends;
    private int friendsSize;

    public Friends() {
        friends=new Student[1];
        friendsSize=1;
    }

    public void addFriend(Student student){
        int i=0;
        while (friends[i]!=null){
            i++;
            if (i>friends.length-1) {
                break;
            }
        }
        if (i>=friends.length) {
            Student[] buff = new Student[i+1];
            buff= Arrays.copyOf(friends,buff.length);
            friends=buff;
        }
        friends[i]=student;
        friendsSize++;
    }

    public Student get(int i){
        return friends[i];
    }

    public void deleteFriend(int i){
        if (i<friends.length){
            friends[i]=null;
            for (int j =i ; j <friends.length-1 ; j++) {
                friends[j]=friends[j+1];
            }
            friends[friends.length-1]=null;
            friendsSize--;
        }

    }
    public int friendsSize(){
        return friendsSize;

    }
}
