package _20210224_函数式接口_未完;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//函数式接口作为方法的返回值
public class ComparatorDemo {
    public static void main(String[] args) {
        //定义集合
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ccc");
        arrayList.add("aa");
        arrayList.add("b");
        arrayList.add("ddd");
        System.out.println("排序前："+arrayList);
        Collections.sort(arrayList);//自然顺序
        System.out.println("排序后："+arrayList);
        Collections.sort(arrayList,getComparator());
        System.out.println(arrayList);

    }
    private static Comparator<String> getComparator(){
/*        //匿名内部类
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();  //从小到大不变顺序,从大到小，翻一下
            }

        };
        return comp;*/
        //lambda表达式
        return (s1,s2)->s1.length()-s2.length();

    }
}
