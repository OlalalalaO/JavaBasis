package _20210217_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class 与IO流结合 {
    public static void main(String[] args) throws IOException {
       // myStroe();

        myLoad();

    }

    private static void myLoad() throws IOException { //将文件中的内容加载到内容中去
        Properties prop = new Properties();
        FileReader fr = new FileReader("res\\1.m");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStroe() throws IOException {  //将Properties保存到文件中
        Properties prop = new Properties();
        prop.setProperty("1","3");
        prop.setProperty("赵子轩","3");
        prop.setProperty("东方闪电","3");

        FileWriter fw = new FileWriter("res\\1.m");
        prop.store(fw,null);//null是描述信息
        fw.close();
    }
}
