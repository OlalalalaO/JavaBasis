package _20210202_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //list继承自collection
        list.add("123");
        list.add("world");
        list.add("java");
        list.add("world"); //可以重复
        System.out.println(list);//存入和取出的顺序相同


        //迭代
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }


}
