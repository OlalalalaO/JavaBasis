package _20210118_extend;

public class Zi extends  Fu{

    /*@Override  父类中的私有内容，子类不会接触到
    private void show(){

    }*/
    /*@Override
    public void Method(){
        System.out.println("父中的method方法被调用");
    }*/
    @Override //子类重写父类的访问权限不必父类低   public > 默认 >私有
    void Method(){
        System.out.println("父中的method方法被调用");
    }
}
