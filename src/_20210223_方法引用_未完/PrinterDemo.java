package _20210223_方法引用_未完;

public class PrinterDemo {
    public static void main(String[] args) {
        usePrinter(S-> System.out.println(S.toUpperCase()));


        PrintString ps = new PrintString();
        //usePrinter();
    }
    private static void usePrinter(Printer p){
        p.printUpperCase("HelloWorld");
    }
}
