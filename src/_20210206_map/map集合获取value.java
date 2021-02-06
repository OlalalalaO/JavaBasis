package _20210206_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map集合获取value {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();//key是唯一的，key重复就是修改
        map.put("it01","林青霞");
        map.put("it002","张曼玉");
        map.put("it003","qwe");
        map.put("it004","weqwe");
        map.get("it004");
        map.get("2");
        Set<String> set = map.keySet(); //获取key的集合,因为key不重复，所以是set集合
        for (String s : set) {
            System.out.println(s);
        }

    }
}
