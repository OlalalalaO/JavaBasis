package _20210224_Supplier接口;

import java.util.function.Supplier;

public class SupplierDemo { //返回供应商
    public static void main(String[] args) {
        String s = getString(()->"林青霞");
        System.out.println(s);
    }

    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
