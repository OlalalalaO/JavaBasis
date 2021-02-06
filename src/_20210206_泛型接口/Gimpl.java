package _20210206_泛型接口;

public class Gimpl<T> implements Ginterface<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
