package _20210204_泛型方法;

public class Gs<T>{
/*    public void show(T t){
        System.out.println(t);
    }*/

    /**
     * 泛型方法
     * @param t
     * @param <T>
     */
    public <T> void show(T t){
        System.out.println(t);
    }
}
