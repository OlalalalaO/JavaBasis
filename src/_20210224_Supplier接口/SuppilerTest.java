package _20210224_Supplier接口;

import java.util.function.Supplier;

public class SuppilerTest {
    public static void main(String[] args) {
        int[] arr = {10,9,3,43,123,453,12,451,23};

        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];

            }
            return max;
        });

        System.out.println(max1);
    }
    //返回int数组最大值
    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
