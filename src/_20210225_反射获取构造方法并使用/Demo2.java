package _20210225_反射获取构造方法并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> c = Class.forName("_20210225_反射.Student");  //获取class对象
        Constructor<?> con = c.getDeclaredConstructor(String.class);  //此方法私有，不能创建对象

        //暴力反射，值为true，取消访问检查
        con.setAccessible(true);
        Object o = con.newInstance("林青霞");
        System.out.println(o);

    }
}
