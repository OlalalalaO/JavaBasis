package _20210204_treeset;

import java.util.TreeSet;

/*
treeset 元素不重复，有序，有迭代次序，无带索引的方法

 */
public class treesetDemo {
    public static void main(String[] args) {
        //创建对象
        var ts = new TreeSet<Integer>(); //引用类型  无参构造方法，选择自然排序进行排序
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        for (Integer t : ts) {
            System.out.println(t);
        }

    }
}
