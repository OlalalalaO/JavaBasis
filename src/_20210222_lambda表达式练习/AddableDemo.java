package _20210222_lambda表达式练习;

public class AddableDemo {
    public static void main(String[] args) {
/*        useAdd((int x,int y)->{  //相当于直接重写了add方法
           return x+y;
        });*/
        useAdd((x,y)->{ //参数类型可以省略
            return x+y;
        });
        useAdd(((x, y) -> x+y)); //代码块只有一句，return也可以省略掉
    }
    public static void useAdd(Addable s){
        int sum = s.add(10,20);
        System.out.println(sum);
    }
}
