package _20210206_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class traMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//key是唯一的，key重复就是修改
        map.put("it01", "林青霞");
        map.put("it002", "张曼玉");
        map.put("it003", "qwe");
        map.put("it004", "weqwe");
        /**************遍历方式一****************/
        Set<String> ketSet = map.keySet();
        for (String s : ketSet) {
            String value = map.get(s);
            System.out.println(value); //倒数输出
        }



        /**************遍历方式二***************/
        Set<Map.Entry<String,String>> entrySet = map.entrySet(); //获取键值对
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key+" "+value);
        }
    }


}
