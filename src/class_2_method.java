public class class_2_method {
    public static void main(String[] args) {
        /*
        方法 = 步骤 = 函数
        格式:
        public static void 方法名(){
        方法体
        }
         */
        /*
        基本类型的参数传递，在方法中形参改变，不会改变同参数的值
         */
        int array[] = new int[]{1,2,3,4,5};
        int num = 9;
        num(num);
        System.out.println(num);
        /*
        引用类型的参数传递
         */
        int arr[] = new int[]{1,2,3};
        System.out.println("改变前的值"+arr[1]);
        change(arr);
        System.out.println("改变后的值"+arr[1]);
        /*
        数组遍历
         */
        tra(array);
        /*
        方法重载
         */
        int result = sum(10,12);
        System.out.println(result);
        double result_1 = sum(19.1,19.2,29.3);
        System.out.println(result_1);
        int result_2 = sum(10,20,30);
        System.out.println(result_2);
    }
    // 定义方法  注：不能嵌套方法，方法全部平级
    public  static  void is_evebt_number(int num){
        if(num%2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
//    方法重载；方法名相同，返回值，和参数均不同，切属于一个类中
//    与返回值无关
    public  static  int sum(int a,int b){
        return  a + b;
    }
    public  static  double sum(double a,double b,double c){
        return  a + b + c;
    }
    public  static  int sum(int a,int b,int c){
        return  a + b + c;
    }
//  基本类型参数传递
    public  static  void num(int num){
        num = 10;
    }
//   引用类型参数传递
    public static  void change(int[] arr){
        arr[1] = 200;
    }
    public static void tra(int arr[]){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print("数组的第");
            System.out.print(i+1);
            System.out.println("个元素为"+arr[i]);
        }
    }
}
