package oop;

/**
 * Created by sergey on 04.11.16.
 */
public class Dog extends Animal {
    private String name;
    public Dog(int weight, int x, int y,String name) {
        super(weight, x, y);
        this.name=name;
    }

    @Override
    void sing() {
        System.out.println("Гав-Гав");
    }
}
