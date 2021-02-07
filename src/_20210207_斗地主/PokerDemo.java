package _20210207_斗地主;

import java.util.ArrayList;

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

    }
}
