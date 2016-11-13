package oop;

import java.util.Random;

/**
 * Created by sergey on 04.11.16.
 */
public class Duck extends Animal implements Bird {
    private String name;

    public Duck(int weight, int x, int y,String name) {
        super(weight, x, y);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    void sing() {
        System.out.println("Кря-Кря");
    }


    @Override
    public void fly(boolean isCommand,int x,int y) {
        System.out.println(name+"Полетела");
        if (isCommand){
            move(x,y);
        }else {
            move(new Random().nextInt(7), new Random().nextInt(7));
        }
    }
}
