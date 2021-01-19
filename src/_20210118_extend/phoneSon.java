package _20210118_extend;

public class phoneSon extends phone{
   @Override //帮助检验重写
    public void call(String name) { //子类重写父类的方法，加入自己特有的功能，也可继承父类的方法

        // 重写父类方法必须和父类方法名字一样
        System.out.println("开启视频功能");
        super.call(name); //调用父类的方法
    }
}
