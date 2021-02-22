package _20210222_lambda表达式练习;

public class FlyableDemo {
    public static void main(String[] args) {
/*        fly((String a)->{
            System.out.println(a);  //与fly中的重写方法相同
            System.out.println("我会飞了");  //直接重写fly方法
        });*/
/*        fly(s->{  //如果参数只有一个，那么小括号也可以省略
            System.out.println(s);
        });*/
        fly(s-> System.out.println(s)); //如果代码块的内容只有一个，大括号和分号也可以省略
    }
    public static void fly(Flyable s){
        s.fly("飞了");
    }
}
