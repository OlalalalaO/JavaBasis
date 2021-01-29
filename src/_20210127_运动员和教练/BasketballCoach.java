package _20210127_运动员和教练;

public class BasketballCoach extends Coach{
    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
}
