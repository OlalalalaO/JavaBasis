package _20210217_properties;

import java.util.Properties;
import java.util.Set;

public class 作为map集合的使用 {
    public static void main(String[] args) {
        Properties prop = new Properties(); //不用加泛型，不是泛型类,本质是一个hash,有key和value
        prop.put("java001","666");
        prop.put("java002","777");
        prop.put("java003","888");
        prop.setProperty("weqwe","weqwe");//底层调用了put方法，设置集合的键和值
/*
        System.out.println(prop);

        System.out.println(prop.getProperty("java002")); //根据键得到值，没有则返回null
*/

        Set<String> names = prop.stringPropertyNames();  //得到了键的集合
        for (String name : names) {
            System.out.println(name);
            System.out.println(prop.getProperty(name));
        }
/*        Set<Object> keySet = prop.keySet();
        for (Object o : keySet) {
            Object value = prop.get(o);
            System.out.println(o+" "+value);
        }*/
    }
}
