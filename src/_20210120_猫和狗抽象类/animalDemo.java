package _20210120_猫和狗抽象类;

public class animalDemo {
    public static void main(String[] args) {
        //创建对象
        animal a = new cat();
        a.setAge(10);
        a.setName("加菲猫");
        System.out.println(a.getAge()+"  "+a.getName());
        a.eat();

        a = new cat("加肥",5);
        System.out.println(a.getAge()+"  "+a.getName());
    }
}
