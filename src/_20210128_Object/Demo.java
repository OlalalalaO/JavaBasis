package _20210128_Object;

import java.io.PrintStream;

//ctrl +b 查看声明
public class Demo {
    public static void main(String[] args) {
        student s = new student();
        s.setAge(30);
        s.setName("林青霞");
        System.out.println(s); //输出“_20210128_Object.student@7ef20235”
        //System.out.println(s.toString());
        student s1 = new student("林青霞",30);
        System.out.println(s1 == s);//比较地址值，不可取
        System.out.println(s1.equals(s)); //会比较地址，因为都继承于object，所以会比较地址，建议在类中重写equal方法
        /*public void println(Object x) { //x等价与s
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }*/
/*        public static String valueOf(Object obj) { //obj = x
            return (obj == null) ? "null" : obj.toString();
        }*/
/*        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/



    }
}
