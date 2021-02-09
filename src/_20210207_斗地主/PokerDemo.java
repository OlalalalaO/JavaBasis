package _20210207_斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //装牌
        String[] colors = {"♦","♣","♥","♠"};  //定义花色

        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");
        System.out.println(array);
        //洗牌
        Collections.shuffle(array); //洗牌
        System.out.println(array);
        //发牌
        ArrayList<String> lqx = new ArrayList<>();
        ArrayList<String> zmy = new ArrayList<>();
        ArrayList<String> zbz = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>(); //底牌
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if(i>=array.size()-3){ //留底牌
                dp.add(poker);
            }else if(i%3 == 0){
                lqx.add(poker);
            }else if(i%3 == 1){
                zmy.add(poker);
            }else if(i%3 == 2){
                zbz.add(poker);
            }

        }
        look("lqx",lqx);
        look("zmy",zmy);
        look("zbz",zbz);
        look("底牌",dp);
    }
    public static void look(String name ,ArrayList<String> array)
    {
        System.out.print(name+"的牌是");
        for (String poker : array) {
            System.out.print(poker+" ");

        }
        System.out.println();
    }
}
