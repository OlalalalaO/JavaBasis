package _20210129_字符串中的数据排序;


import java.util.Arrays;

/*
把字符串中的数字存入数组中
 */
public class Demo {
    public static void main(String[] args) {
        String s = "31 56 85 25";
        String[] strA = s.split(" "); //以空格为分界线分割字符串并存入字符串数组中
        for (int i = 0; i < strA.length; i++) {
            System.out.println(strA[i]);
        }
        int[] arr = new int[strA.length];
        for (int i = 0; i < arr.length; i++) { //转换int存入数组中
            arr[i] = Integer.parseInt(strA[i]);  //字符串转
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr); //排序
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<arr.length;i++){
            if(i == arr.length-1){ //最后一位不加空格
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }

        }
        String result = sb.toString();
        System.out.println(result);
    }
}
