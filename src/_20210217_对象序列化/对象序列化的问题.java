package _20210217_对象序列化;

import java.io.*;

public class 对象序列化的问题 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res\\oos.txt"));
        Student s = new Student("林青霞",30);
        oos.writeObject(s);//写序列化资源
        oos.close();*/



        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res\\oos.txt"));
        Object obj = ois.readObject();
        Student s1 = (Student) obj;
        System.out.println(s1.getName()+" "+s1.getAge());
        ois.close();

        //假如修改了序列化对象的类文件，反序列化会不会出现问题
        //会出问题
        //改变了序列化的id,可以通过设置一个显示的id来避免
    }
}
