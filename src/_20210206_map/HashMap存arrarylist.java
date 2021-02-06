package _20210206_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap存arrarylist {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> HM = new HashMap<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("weqw");
        arrayList1.add("sfsdfs");
        arrayList1.add("xccvxcv");
        arrayList2.add("bvbvb");
        arrayList2.add("jgjghj");
        HM.put("1",arrayList1);
        HM.put("2",arrayList2);
        Set<String> hm = HM.keySet();
        for (String s : hm) {
            ArrayList<String> a = HM.get(s);
            for (String s1 : a) {
                System.out.println(s1);
            }
        }
    }
}
