package _20210225_Stream流;

import java.util.*;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        Map<String,Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();  //间接生成流
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        String[] strArr = {"hello","world","java"};
        Stream<String> strArrStream = Stream.of(strArr);
        Stream<String> hello = Stream.of("hello", "world", "java");
        Stream<Integer> integerStream = Stream.of(10, 20, 30);


    }
}
