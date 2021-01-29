package _20210127_运动员和教练;

public class BasketballPlayer extends Player{
    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员喝牛奶");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
