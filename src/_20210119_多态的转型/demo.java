package _20210119_多态的转型;
/*
向上转型    父类引用指向子类，子类对象指向父类
向下转型     父类引用转为子类对象
 */
public class demo {
    public static void main(String[] args) {
        animal cat = new cat();  //多态 向上转型 动物类型
        cat.eat(); // 输出猫吃鱼

       //  a.playGame();  会报错，因为playgame 属于cat特别的方法

        ((cat)cat).playGame();//多态 向下转型   animal属于父类，cat属于父类
    }
}
