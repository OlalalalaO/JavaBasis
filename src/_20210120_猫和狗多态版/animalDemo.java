package _20210120_猫和狗多态版;

public class animalDemo {
    public static void main(String[] args) {
        animal a = new cat();  //多态
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + " " + a.getAge());
        a.eat();

        a = new cat("蓝猫", 5);
        System.out.println(a.getName() + " " + a.getAge());
        a.eat();
    }
}
