package _20210119_多态的好处和弊端;

public class animaldemo {
    public static void main(String[] args) {
        animaloperate ao = new animaloperate(); //创建了一个animaloperate对象
        cat c = new cat(); // 创建一个cat
        ao.useanimal(c);

        dog d = new dog();
        ao.useanimal(d);
        ao.useanimal(d);
    }
}
