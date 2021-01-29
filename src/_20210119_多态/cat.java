package _20210119_多态;

public class cat extends animal{
    int age = 10;
    int weight = 90;
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
