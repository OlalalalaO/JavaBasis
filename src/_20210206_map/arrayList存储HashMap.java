package _20210206_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class arrayList存储HashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
        map.put("111","213");
        map.put("ewe","23123");
        map.put("embeds","2312323");
        map2.put("3434","were");
        map2.put("coccyx","enter");
        arrayList.add(map);
        arrayList.add(map2);
        for (HashMap<String,String> m : arrayList) {
            Set<String> s = m.keySet();
            for (String s1 : s) {
                String V = m.get(s1);
                System.out.println(V);
            }
        }
    }
}
