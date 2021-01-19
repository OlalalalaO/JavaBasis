package Private;

public class student {
//    private 是一个修饰符，可以修饰成员变量和成员方法，保护变量和方法不能被外界访问，只可以在本类中访问
    String name;
    private int age;
    /*
    通过此方法，在本类外设置age
     */
    public void set_age(int a){
        /*
        可以对age进行判断
         */
        //age = a;
        if(a<0 || a>120){
            System.out.println("你给的年龄有误");
        }else{
            age = a;
        }
    }
    /*
    通过此方法访问age
     */
    public int get_age(){
        return age;
    }
    public void show(){
        System.out.println(name+","+age); //在此方法中还可以被访问
    }
}
