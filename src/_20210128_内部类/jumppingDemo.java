package _20210128_内部类;

public class jumppingDemo {
    public static void main(String[] args) {
        jumppingOperator jo = new jumppingOperator();
        jumpping j = new cat();
        jo.method(j); //猫可以调高

        jumpping j2 = new dog();
        jo.method(j2);//狗可以调高


        //每次都得写，创建一个类
        //简化版
        System.out.println("-------");
        jo.method(new jumpping() {
            @Override
            public void jump() {
                System.out.println("猫和狗都可以跳高");
            }
        });

    }
}
