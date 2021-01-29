package _20210123_猫和狗接口版;
/*
测试类
 */
public class animalDemo {
    public static void main(String[] args) {
        jumooing j = new dog();
        j.jump();
/*dog里面所含方法是最多的**/
        animal a = new dog();
        a.setName("加肥");
        a.setAge(5);
        System.out.println(a.getAge()+a.getName());
        a.eat();

    }
}
