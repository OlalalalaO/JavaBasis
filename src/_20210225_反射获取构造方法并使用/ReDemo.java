package _20210225_反射获取构造方法并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("_20210225_反射.Student");  //获取对象

/*        Constructor<?>[] cons = c.getConstructors();  //获取公共构造方法，存入数组

        for (Constructor<?> con : cons) {
            System.out.println(con);
        }*/
        System.out.println("-----------------");
        Constructor<?>[] Dcons = c.getDeclaredConstructors();  //获取公共的，私有的，默认的
        for (Constructor<?> dcon : Dcons) {
            System.out.println(dcon);
        }

        System.out.println("-------");
        Constructor<?> con = c.getDeclaredConstructor();  //返回一个指定的构造函数，参数表示你要获取的构造方法的参数的个数，和数据类型对应的字节码文件对象
        Object o = con.newInstance();  //创建学生类对象
        System.out.println(o);

    }
}
