package _20210114_string;

public class jointString {
    //定义一个方法，把int数组的数据按照指定的格式拼接成一个字符串返回
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr); //将字符数组转换为字符串
        System.out.println("s："+s);
    }
    //定义方法
    public static String arrayToString(int[] arr){
        String s = "";
        s += "["; //字符串可以直接相加
        for (int i = 0;i<arr.length;i++){
            if(i==arr.length+1){ //如果是最后一个元素
                s += arr[i];  //
            }else{
                s += arr[i];
            }
        }
        s += "]";
        return s;
    }
}
