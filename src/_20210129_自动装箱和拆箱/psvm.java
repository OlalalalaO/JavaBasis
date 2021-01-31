package _20210129_自动装箱和拆箱;

public class psvm {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100); //装箱
        Integer ii = 100;//自动装箱

        //
        ii = ii.intValue()+200; //拆箱后自动装箱
        ii += 200; //自动拆箱
        System.out.println(ii);
    }
}
