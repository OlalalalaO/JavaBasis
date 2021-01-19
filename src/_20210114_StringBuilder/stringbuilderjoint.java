package _20210114_StringBuilder;

public class stringbuilderjoint {
    public static void main(String[] args) {
// 将数组中的数拼接好
        int[] arr = {1,2,3,4};
        System.out.println(arr);
        System.out.println(arrToString(arr));
    }
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
