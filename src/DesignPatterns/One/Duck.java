package DesignPatterns.One;

public class Duck  implements Flyable{

    private Quackable quack;
    private Flyable fly;


    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public Flyable getFly() {
        return fly;
    }

    @Override
    public void fly() {
        System.out.println("Duck is me");

    }
}
