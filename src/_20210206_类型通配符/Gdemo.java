package _20210206_类型通配符;

import java.util.ArrayList;
import java.util.List;

public class Gdemo {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Object>(); //?表示他的元素可以匹配任何类型，但不能把元素添加进去
        List<? extends Number> list11 = new ArrayList<>();  //设置类型的上限
        List<? super Number> list7 = new ArrayList<Object>();


    }
}
