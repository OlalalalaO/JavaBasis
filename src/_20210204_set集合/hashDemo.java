package _20210204_set集合;

public class hashDemo {
    public static void main(String[] args) {
        //得到hash值
        Student s1 = new Student(30,"林青霞");
        //同一个对象多次调用hash的值相同
        System.out.println(s1.hashCode()); //2129789493
        System.out.println(s1.hashCode());

        Student s2 = new Student(30,"林青霞"); //668386784
        System.out.println(s2.hashCode()); //默认情况下不同对象的hashcode值不同,可在Student内重写hashcode方法

        System.out.println("hello".hashCode());
        /*************************************/
        System.out.println("---------------------");
        System.out.println("种地".hashCode());
        System.out.println("通话".hashCode());
    }
}
