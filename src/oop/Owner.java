package oop;

/**
 * Created by sergey on 04.11.16.
 */
public class Owner {
    private int x;
    private int y;
    String name;
    public Owner(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name=name;
    }

    public void comeHere(int x,int y, Animal animal){
        animal.move(x,y);
    }

    public void goFly(int x,int y,Duck duck){
        duck.fly(true,x,y);
    }

    public void getFood(Animal animal,int food){
        animal.eat(food);
    }


}
