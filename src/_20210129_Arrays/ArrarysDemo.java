package _20210129_Arrays;
import java.util.Arrays;
public class ArrarysDemo {
    public static void main(String[] args) {
        int[] arr = {24,56,89,24,26,98};
        System.out.println("排序前"+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后"+ Arrays.toString(arr));
    }
}
