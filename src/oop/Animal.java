package oop;

/**
 * Created by sergey on 04.11.16.
 */
abstract class Animal {
    protected int weight;
    protected int x;
    protected int y;
    protected boolean isAlive;
    protected int satiety;
    public Animal(int weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
        isAlive=true;
        satiety=100;
    }

    public void isDead(){
        if (satiety<=0){
            isAlive=false;
            System.out.println("Кто-то умер от голода");
        }
    }

    public void vomit(){
        satiety=100;
        satiety-=20;
    }

    public void eat(int food){
         if (satiety>=100){
             vomit();
         }else {
             satiety+=food;
         }
    }
    abstract void sing();

    public int[] move(int x,int y){
        this.x+=x;
        this.y+=y;
        return new int[]{x, y};
    }

}
