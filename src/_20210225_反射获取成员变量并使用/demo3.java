package _20210225_反射获取成员变量并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("_20210225_反射.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(obj,"林青霞");


        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj,"林青霞",30);
        System.out.println(o);

        Method fun = c.getDeclaredMethod("fun");
        fun.setAccessible(true);
        fun.invoke(obj);

    }

}
