package _20210212_字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class 字符串的编码和解码 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        /********编码********/
        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys)); //占三个字节，默认utf-8
        byte[] bytes = s.getBytes("utf-8");/*[-28, -72, -83, -27, -101, -67]*/
        System.out.println(Arrays.toString(bytes));
        byte[] b = s.getBytes("gbk");
        System.out.println(Arrays.toString(b));//[-42, -48, -71, -6]

        String ss = new String(bys);
        System.out.println(ss);/*中国*/

        String utf8 = new String(bys,"utf-8");
        System.out.println(utf8);/*中国*/

        String gbk = new String(b,"gbk");
        System.out.println(gbk);/*中国*/
    }
}
