package _20210225_反射获取成员变量并使用;

import _20210225_反射.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("_20210225_反射.Student");
        Field[] fields = c.getFields(); //获取公共的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {  //获取所有的成员变量
            System.out.println(declaredField);
        }
        Field address = c.getField("address"); //获取指定成员变量

        Constructor<?> con = c.getConstructor();

        Object obj = con.newInstance();

        address.set(obj,"西安");

        System.out.println(obj);


    }
}
