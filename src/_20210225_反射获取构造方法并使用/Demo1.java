package _20210225_反射获取构造方法并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    /**
     *
     * @param args
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("_20210225_反射.Student");  //获取class对象
        Constructor<?> con = c.getDeclaredConstructor(String.class,int.class,String.class);  //基本数据类型也可以通过.class得到对应的class类型
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
