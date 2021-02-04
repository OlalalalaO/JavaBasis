package _20210204_数据结构;

import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        linkedList.addLast("asdasd");
        linkedList.addFirst("javase");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("11111"+linkedList.removeFirst()); //remove返回被删除的元素
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
