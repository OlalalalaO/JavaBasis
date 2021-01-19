package _20210114_StringBuilder;

public class stringbuilderTostring {
    public static void main(String[] args) {
        /***************stringbuilder转string**************/
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);

        /***************string转stringbuilder*****************/
        String s1 = new String("hello");


        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(s);
    }
}
