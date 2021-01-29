package _20210119_多态的好处和弊端;

public class animaloperate {
    /*public void useanimal(cat c){ //cat c = new cat();  传入cat
        c.eat();
    }
    public void useanimal(dog d){
        d.eat();
    }*/
    public void useanimal(animal a){ //猫和狗都都继承自animal类  使用父类型定义参数，使用子类型
        a.eat();
        //  a.lookdook();  多态不能访问子类特殊的成员方法
    }
}
