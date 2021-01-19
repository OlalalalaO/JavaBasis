package _20210118_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrarylist {
    public static void main(String[] args) {
        // 数组长度固定，集合长度可变
        ArrayList<String> array = new ArrayList<>(); //尖括号代表元素类型
        //输出集合
        System.out.println("array"+array); //输出[]
        //添加元素
        array.add("hello");
        System.out.println(array); //输出[hello]
        array.add("world");
        array.add("123123");
        System.out.println(array);  //输出[hello, world, 123123] 每个元素用，隔开

        //在集合的指定位置插入指定元素
        array.add(1,"java");

        System.out.println(array);  //输出[hello, java, world, 123123] 原来位置元素向后移动一位
        array.add(4,"123231"); //集合越界









    }
}
