package _20210220_线程安全;

import _20210218_买票.SellTicket;

public class SellTicketDemo {
    public static void main(String[] args) {
        _20210218_买票.SellTicket st = new SellTicket();


        Thread t1 = new Thread(st,"窗口一");

        Thread t2 = new Thread(st,"窗口二");

        Thread t3 = new Thread(st,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
