package _20210220_线程安全;

import java.util.*;

public class 线程安全类 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(); //方法全部上锁
        StringBuilder sb = new StringBuilder();  //方法无锁，不安全

        Vector<String> vt = new Vector<>(); //方法全部同步
        ArrayList<String> arrayList = new ArrayList<>(); //不安全

        Hashtable<String,String> hashtable = new Hashtable<>();//线程安全
        HashMap<String,String> hashMap = new HashMap<>();


        //在多线程环境下，尽量用安全的

        List<String> list = Collections.synchronizedList(new ArrayList<String>());//调用此方法后生成线程安全的集合类
//

    }
}
