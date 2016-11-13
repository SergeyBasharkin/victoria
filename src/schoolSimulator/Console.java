package schoolSimulator;

import java.util.Scanner;

/**
 * Created by sergey on 13.11.16.
 */
public class Console {
    MyStudent myStudent= new MyStudent();
    Course[] courses={new FirstCourse(),new SecondCourse(), new ThirdCourse()};


    public void start(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Выберите нагрузку");

        while (true){
            switch (scanner.nextInt()){
                case 1: lowPower();
                    break;
                case 2: middlePower();
                    break;
                case 3: heightPower();
                    break;

            }
        }
    }
    private  void heightPower() {
        myStudent.fillProgress();
        myStudent.removeSubCommunication();
        myStudent.removeFood();
        if (!myStudent.isAlive()){
            System.out.println("Game over");
            System.exit(1);
        }
        if (myStudent.nextCourse(courses[myStudent.currentCourse+1])){
            System.out.println("Next course");
        }
    }

    private  void middlePower() {
        myStudent.fillFood();
        if (!myStudent.isAlive()){
            System.out.println("Game over");
            System.exit(1);
        }
        if (myStudent.nextCourse(courses[myStudent.currentCourse+1])){
            System.out.println("Next course");
        }
    }

    private  void lowPower() {
        myStudent.fillFood();
        myStudent.fillSubCommunication();
        myStudent.removeProgress();
        if (!myStudent.isAlive()){
            System.out.println("Game over");
            System.exit(1);
        }
        if (myStudent.nextCourse(courses[myStudent.currentCourse+1])){
            System.out.println("Next course");
        }

    }
}
