package _20210222_lambda表达式练习;
//使用：有接口，且接口只有一个抽象方法；必须有上下文环境比如runnable
//规定：lambda表达式必须是一个接口，不可以是抽象类或具体类
//注：使用匿名内部类会产生一个.class文件
//格式：(形式参数)->{代码块}
public class EatableDemo {
    public static void main(String[] args) {
        Eatable e =new  EatableImpl();
        useEatable(e);

        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });
        useEatable((/*接口中的参数*/) -> {
            System.out.println("一天一苹果，医生远离我");  //重写了eat方法
        });
        //Runnable内也只有一个方法
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
