package _20210206_可变参数的使用;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2we","qwe","sda");  //返回由指定数组支持的固定大小的列表,不可修改大小，只能改动元素
        System.out.println(list);
        //list.add("sdasd"); UnsupportedOperationException
//        list.remove("2we");UnsupportedOperationException
        list.set(1,"jace");
        System.out.println(list);
    }
}
