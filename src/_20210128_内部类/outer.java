package _20210128_内部类;
/*
成员内部类
 */
public class outer {
    private int num = 10;

    private class in{ //常用对象
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        in i = new in(); //间接调用方法
        i.show();
    }


    public class inner{ //是为了隐藏内容，写法并不常见
        public void show(){
            System.out.println(num);
        }
    }
}
