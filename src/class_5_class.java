public class class_5_class {
    /*
    类 一组对象所具有的相同的信息，抽象出来的东西，类似于结构体
    example:
        类：手机
        属性：品牌，价格————————变量
        行为：打电话，发短信—————方法
        对象：小米手机，华为手机
     */
//    手机类
//    成员变量=属性=描述
    String brand; //手机品牌
    int price;  //手机价格
//    成员方法=方法=能干什么
    public void call(){
        System.out.println("打电话");
    }
    public void message(){
        System.out.println("发短信");
    }
}
