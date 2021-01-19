package _20210118_ArrayList;

import java.util.ArrayList;

public class arraylistMethod {
    public static void main(String[] args) {
        //删除元素并返回
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("qwe");
        arrayList.add("zzxc");
        System.out.println(arrayList); //输出[java, qwe, zzxc]
/****************删除方法***************/
        arrayList.remove("java"); //输出[qwe, zzxc]
        arrayList.remove("rtrt"); //不报错，但没用任何用处

        arrayList.remove(1);/*输出[qwe]*/
   //     arrayList.remove(3); /* 索引越界*/
        System.out.println(arrayList);
/********************修改方法****************/
        arrayList.add("mbnb");
        arrayList.add("vvvv");
         /*输出[qwe, mmmm, vvvv]*/
        System.out.println(arrayList.set(1,"mmmm"));  //此时元素被修改，并返回修改的元素
/*******返回指定位置的元素************/

        System.out.println(arrayList.get(1)); //输出mmmm
        // System.out.println(arrayList.get(4));  集合越界
        /**********返回元素个数**********/
        System.out.println(arrayList.size()); //输出3

    }
}
