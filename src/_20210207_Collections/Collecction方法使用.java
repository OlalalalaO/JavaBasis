package _20210207_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collecction方法使用 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(10);
        list.add(89);

        Collections.sort(list);//按自然顺序排序，升序
        System.out.println(list);
        Collections.reverse(list); //翻转
        System.out.println(list);
        Collections.shuffle(list);//随机置换:洗牌
        System.out.println(list);
    }
}
