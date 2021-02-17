package _20210217_对象序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
存储对象的类型，数据
 */
public class 对象序列化流 {
    /*.NotSerializableException ,实例化对象必须实现此接口Serializable*/
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res\\oos.txt"));


        Student s = new Student("林青霞",30);

        oos.writeObject(s);//写序列化资源

        oos.close();
    }
}
