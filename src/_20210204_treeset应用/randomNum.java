package _20210204_treeset应用;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Random r = new Random();
        while (hs.size()<10){
            hs.add(r.nextInt(20)+1);
        }
        System.out.println(hs);
    }
}
