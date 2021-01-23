package _20210119_modifier;
/*
public 都可访问
protected 不同包的无关类不可访问
默认 不同包不可访问
private 只可在同一个类中访问
 */
public class demo {
    public static void main(String[] args) {
        fu f = new fu();
        f.show3();
        f.show2();
        f.show4();
    }
}
