package _20210225_Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream中间操作 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("刘岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        ArrayList<String> sort = new ArrayList<>();
        sort.add("sadas");
        sort.add("fsdfa");
        sort.add("sdafas");
        sort.add("dasfsafsa");
        sort.add("esdada");
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //把list集合中以张开头的数据在控制台输出
        arrayList.stream().filter((String s)->s.startsWith("张")).forEach(System.out::println);
        System.out.println("--------");

        //把list集合中长度为3的元素在控制台输出
        arrayList.stream().filter(s->s.length() == 3).forEach(System.out::println);

        System.out.println("--------");

        //以张开头，长度为3的
        arrayList.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(System.out::println);


        System.out.println("--------");
        //取前三个数据
        arrayList.stream().limit(3).forEach(System.out::println);

        System.out.println("--------");
        //跳过前三个，把剩下的输出
        arrayList.stream().skip(3).forEach(System.out::println);

        System.out.println("--------");
        //跳过两个元素，把剩下的元素中前2个控制台输出
        arrayList.stream().skip(2).limit(1).forEach(System.out::println);

        //取前四个数据组成一个流
        Stream<String> s1 = arrayList.stream().limit(4);

        //跳过两个数据组成一个流
        Stream<String> s2 = arrayList.stream().skip(2);

        System.out.println("~~~~~~~~~~~~");
        //合并两个流
        //Stream.concat(s1,s2).forEach(System.out::println);
        //去除重复的流
        Stream.concat(s1,s2).distinct().forEach(System.out::println);


        System.out.println("~~~~~~~~~~~~");
        //排序
        //按照字母顺序输出
        sort.stream().sorted().forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~");
        //按长度排序
        sort.stream().sorted((ss1,ss2)->ss1.length()-ss2.length()).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~");
        //按长度排序，长度相同的按首字母排
        sort.stream().sorted((sss1,sss2)->{
            int num = sss1.length()-sss2.length();
            int num2 = num ==0?sss1.compareTo(sss2):num;
            return num2;
        }).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~");
        list.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~");
        //返回总和
        System.out.println(list.stream().mapToInt(Integer::parseInt).sum());

    }
}
