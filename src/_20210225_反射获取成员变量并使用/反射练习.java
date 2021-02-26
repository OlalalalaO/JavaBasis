package _20210225_反射获取成员变量并使用;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class 反射练习 {
    //向arraylist<String> 中添加一个String
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        Class<? extends ArrayList> c = arrayList.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(arrayList,"hello");
        m.invoke(arrayList,"world");

        System.out.println(arrayList);
    }
}
