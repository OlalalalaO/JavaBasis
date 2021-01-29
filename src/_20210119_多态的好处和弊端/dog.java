package _20210119_多态的好处和弊端;

public class dog extends animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookdoor(){
        System.out.println("狗看门");
    }
}
