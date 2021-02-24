package _20210222_接口组成更新;

public class InterImpl implements Inter,Flyable{
    @Override
    public void show() {
        System.out.println("show方法执行了");
    }
}
