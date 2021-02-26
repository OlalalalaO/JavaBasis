package _20210225_反射获取成员变量并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取class对象
        Class<?> c = Class.forName("_20210225_反射.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"林青霞");
        System.out.println(obj);

        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj,30);
        System.out.println(obj);



    }
}
