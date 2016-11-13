package oop;

import java.util.Scanner;

/**
 * Created by sergey on 04.11.16.
 */
public class Farm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Owner me=new Owner(1,2,"Victoria");
        Duck myDuck=new Duck(15,2,0,"Duck");
        while (true){
            int choose=scanner.nextInt();
            if (choose==1){
                me.getFood(myDuck,10);
            }
            myDuck.satiety-=40;
            myDuck.isDead();
            if (!myDuck.isAlive){
                System.out.println(myDuck.getName()+" умерла");
            }
        }
    }
}
