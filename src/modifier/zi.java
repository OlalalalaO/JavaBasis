package modifier;

public class zi extends fu{
    public static void main(String[] args) {
        zi z = new zi();
        //无show1 private只可以在本类中访问
        z.show2();
        z.show3();
        z.show4();
    }
}
