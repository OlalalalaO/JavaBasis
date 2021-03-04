package _20210119_final;

public class student {
    public static int nextid ;
    int id;
    final  String name = "赵子轩" ;  //final定义成员变量必须被初始化
    int age = 20;

    public void setId() {
        this.id = nextid;
        nextid++;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
