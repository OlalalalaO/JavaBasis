package _20210127_运动员和教练;
/*
 有乒乓球和篮球的运动员和教练
 乒乓球相关的人要说英语
 */
public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
    }
}
