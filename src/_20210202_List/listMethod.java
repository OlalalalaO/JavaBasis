package _20210202_List;

import java.util.ArrayList;
import java.util.List;

/*
remove
set
get
 */
public class listMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
/*
确保索引存在
 */
        list.add(1,"wwww");//插入数据，其余数据向后移动
        //list.add(11,"wwww"); //越界会报错
        System.out.println(list);
        System.out.println(list.remove(1)); //返回被删除元素
        //System.out.println(list.remove(11));//索引越界异常
        System.out.println(list.set(1,"6666"));//返回被修改的元素
        System.out.println(list.get(1));
        System.out.println(list);


    }


}
