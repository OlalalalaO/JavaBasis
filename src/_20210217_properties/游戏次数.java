package _20210217_properties;

import java.io.*;
import java.util.Properties;

/*
设计一款只能玩三次的游戏
 */
public class 游戏次数 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("res\\game.txt");
        prop.load(fr); //将文件中的数写入prop
        fr.close();

        String count = prop.getProperty("count");
        int num = Integer.parseInt(count);
        if(num>=3) System.out.println("穷鬼，滚蛋");
        else{
            gameGuss.start();
            num++;
            prop.setProperty("count",String.valueOf(num));
            FileWriter fw = new FileWriter("res\\game.txt");
            prop.store(fw,null);//写入prop
            fw.close();
        }
    }
}
