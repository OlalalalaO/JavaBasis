package _20210207_斗地主;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerUpdataDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] colors = {"♦","♣","♥","♠"};  //定义花色

        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};  //定义点数

        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,color+number);
                arrayList.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        arrayList.add(index);
        index++;
        hm.put(index,"大王");
        arrayList.add(index);
        //洗牌
        Collections.shuffle(arrayList);  //洗的是牌的编号，而不是牌

        //发牌
        TreeSet<Integer> lxqSet = new TreeSet<>();
        TreeSet<Integer> zmySet = new TreeSet<>();
        TreeSet<Integer> zbzSet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int x = arrayList.get(i);
            if(i>=arrayList.size()-3){
                dpSet.add(x); //存的是索引
            }else  if(i%3==0){
                lxqSet.add(x);
            }else if(i%3==1){
                zmySet.add(x);
            }else if(i%3==2){
                zbzSet.add(x);
            }
        }
        lookPoker("lqx",lxqSet,hm);
        lookPoker("zmy",zmySet,hm);
        lookPoker("zbz",zbzSet,hm);
        lookPoker("dp",dpSet,hm);
    }
    public static void lookPoker(String name,TreeSet<Integer> TS ,HashMap<Integer,String>hm){
        System.out.print(name+"的牌是：");
        for (Integer key : TS) {
            String poker = hm.get(key); //根据索引取牌
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
