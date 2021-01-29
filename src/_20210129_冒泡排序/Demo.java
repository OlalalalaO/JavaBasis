package _20210129_冒泡排序;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {154,62645,846,12,32,48,5,356,1564,74};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                int buffer;
                if(arr[j+1]<arr[j])
                {
                    buffer=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buffer;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }


}
