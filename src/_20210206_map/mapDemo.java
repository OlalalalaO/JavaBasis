package _20210206_map;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();//key是唯一的，key重复就是修改
        map.put("it01","林青霞");
        map.put("it002","张曼玉");
        map.put("it003","qwe");
        map.put("it004","weqwe");
        System.out.println(map.containsKey("it003")); //返回布尔类型
        System.out.println(map);
    }
}
