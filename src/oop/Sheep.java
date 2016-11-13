package oop;

/**
 * Created by sergey on 04.11.16.
 */
public class Sheep extends Animal {
    public Sheep(int weight, int x, int y) {
        super(weight, x, y);
    }

    @Override
    void sing() {
        System.out.println("Беее");
    }

}
