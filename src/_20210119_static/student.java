package _20210119_static;

public class student {
    public String name;
    public int age;
    public static String university; //被赋值后不会改变

    public void show(){
        System.out.println(name+" "+ age+" "+university);
    }
}
