package DesignPatterns.One;

public class Zoo {
    public static void main(String[] args) {
        AjeFly ajeFly = new AjeFly();
        NormalFly normalFly = new NormalFly();
        ReasonableQuack reasonableQuack = new ReasonableQuack();
        Duck duck = new Duck();

        duck.fly();
        ajeFly.fly();
        normalFly.fly();
        reasonableQuack.quack();


    }
}
