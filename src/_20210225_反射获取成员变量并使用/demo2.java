package _20210225_反射获取成员变量并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("_20210225_反射.Student");
        Method[] methods = c.getMethods();//获取公共成员方法，包括继承的方法
        Method[] declaredMethods = c.getDeclaredMethods();  //本类所有的方法，不包括继承的

/*        for (Method method : methods) {
            System.out.println(method);
        }*/
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("----------------");

        Method method = c.getMethod("method1");//获取单个方法
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        method.invoke(obj);//调用method方法。
        //Method declaredMethod = c.getDeclaredMethod();//获取私有方法
    }
}
