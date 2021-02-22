package _20210222_lambda表达式练习;

public class EatableDemo {
    public static void main(String[] args) {
        Eatable e =new  EatableImpl();
        useEatable(e);
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
