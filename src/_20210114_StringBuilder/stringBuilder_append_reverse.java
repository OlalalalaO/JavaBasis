package _20210114_StringBuilder;

public class stringBuilder_append_reverse {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("hello");
            sb.append("hello"); //append 添加数据并返回对象本身
        System.out.println("sb"+sb);  //输出hellohello ，sb的值被改变
        //System.out.println("sb2"+sb2);
            sb.append(1222).append("sdsada").append("xcxc"); //链式编程
        System.out.println(sb);  //输出hellohello1222sdsadaxcxc

        /*******反转*******/
        sb.reverse(); //字符串反转并返回字符串本身
        System.out.println(sb); // 输出cxcxadasds2221olleholleh
    }
}
