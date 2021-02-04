package _20210204_list并发修改异常;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        Iterator<String> it = list.iterator();
       /* while ((it.hasNext())){   *//*并发出错，用for循环便可解决*//*
            String s = it.next();
            if(s.equals("222")){
                list.add("java");
            }
        }*/

        System.out.println(list);
    }


}
