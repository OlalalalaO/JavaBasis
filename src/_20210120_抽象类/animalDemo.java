package _20210120_抽象类;

public class animalDemo {

    public static void main(String[] args) {
        //animal a = new animal(); //抽象类不能具体创建对，用多态的形式
        animal a = new cat();
        a.eat();  //输出猫吃鱼属于cat类，eat在animal里是抽象的，在子类中被重写
        a.sleep(); //输出谁家，sleep属于animal类中
    }

}
