package _20210206_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap存储学生对象 {
    public static void main(String[] args) {
        Map<String,String> studet = new HashMap<>();
        studet.put("21","sds");
        studet.put("32","54");
        studet.put("34","56");
        studet.put("45","787");

        /**遍历***/
        Set<String> S = studet.keySet();
        for (String s : S) { //遍历key
            String name = studet.get(s);
            System.out.println(name);

        }
        /********/
        Set<Map.Entry<String,String>> entrySet = studet.entrySet(); //获取所有键值对
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());

        }

    }
}
