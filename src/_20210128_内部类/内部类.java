package _20210128_内部类;

public class 内部类 {
    private int name = 10;//内部类可以访问私有


    public class inner{
        //内部类访问必须创建方法
        public void show(){
            System.out.println(name);
        }
    }
    public void method(){
        inner i = new inner();
        i.show();//访问内部类必须创建对象
    }
}
