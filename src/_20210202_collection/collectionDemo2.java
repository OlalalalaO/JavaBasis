package _20210202_collection;

import java.util.ArrayList;
import java.util.Collection;
//alt+7 打开窗口，看到类的所有信息
public class collectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        System.out.println(c.add("hello"));  //添加元素
        System.out.println(c.add("world"));
        System.out.println(c.add("world")); //只移除最后一个
        System.out.println(c.remove("world"));
        System.out.println(c.remove("111")); //返回false
        c.clear(); //清空所有元素
        System.out.println(c.add("hello"));  //添加元素
        System.out.println(c.add("world"));
        System.out.println(c.add("world")); //只移除最后一个
        System.out.println(c.contains("world")); //判断是否存在该元素
        System.out.println(c.isEmpty()); //判断集合是否为空
        System.out.println(c.size());
        System.out.println(c);
    }
}
