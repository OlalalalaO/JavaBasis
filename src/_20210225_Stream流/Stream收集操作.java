package _20210225_Stream流;

import _20210222_接口组成更新.Inter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream收集操作 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("刘岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        //得到名字为三个字的流
        Stream<String> stringStream = arrayList.stream().filter(s -> s.length() == 3);
        List<String> collect = stringStream.collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        //得到大于25

        Stream<Integer> setStream = set.stream().filter(age -> age > 25);
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for (Integer age : ages) {
            System.out.println(age);
        }
        //得到年龄大于28的流
        String[] strArr = {"林青霞，30","张曼玉，35","王祖贤，33","刘岩，25"};
        Stream<String> arrStream = Stream.of(strArr).filter(s -> Integer.parseInt(s.split("，")[1]) > 28);

        //把数据收集到map中去
        Map<String, Integer> map = arrStream.collect(Collectors.toMap(s -> s.split("，")[0], s -> Integer.parseInt(s.split("，")[1])));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
             System.out.println(entry.getKey());
             System.out.println(entry.getValue());
        }
    }
}