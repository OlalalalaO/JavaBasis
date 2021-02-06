package _20210206_泛型接口;

import _20210204_泛型类.Generic;

public class Gdemo {
    public static void main(String[] args) {
        Gimpl<String> g1 = new Gimpl<>();
        g1.show("林青霞");
        Gimpl<Integer> g2 = new Gimpl<>();
        System.out.println(30);
    }
}
