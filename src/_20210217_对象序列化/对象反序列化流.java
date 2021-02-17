package _20210217_对象序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 对象反序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res\\oos.txt"));


        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName()+" "+s.getAge());
        ois.close();
    }
}
