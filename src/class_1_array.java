public class class_1_array {
    public static void main(String[] args) {
//        psvm+回车生成main函数
//        sout+回城生成输出函数
        /*数组：一次性存储大量同类型的数据*/
        /*定义数组*/
        //格式一 int arr[];
        //格式二 int[] arr1;
        /*数据初始化*/
        //动态初始化
        int[] arr = new int[3];
        /*左边
         *  int 说明数组中的数据类型
         *  []  说明这是一个数组
         *  arr 数组的名称
         **右边
         * new：为数组分配空间
         * int 说明数组类型是int
         * []  说明这是一个数组
         * 3   数组长度
         * */
        /*数组内元素访问：从零开始，在内存中连续，每次加一*/
        System.out.println(arr); //输出:"[I@16b98e56"的数组的首地址
        System.out.println(arr[0]); //输出：“0”数组首位地址指向的元素
        //静态初始化
        int[] arr_1 = new int[]{1, 2, 3, 4, 5};
        int[] arr_2 = {1, 2, 3, 4, 5};
        /*
        数组遍历
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr_1[i]);
        }
        /*
        获取最值
         */
        int max = arr_1[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr_1[j] > max) {
                max = arr_1[j];
            }
        }
        System.out.println("max = " + max);
    }

    }

