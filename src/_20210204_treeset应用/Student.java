package _20210204_treeset应用;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 以二叉树的方式存储
     * 返回值大于0，存储在根的右边
     * 小于0，存储在根的左边
     * 0，不存
     * 读取时采用中序遍历
     * 按照年龄
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
        int num = this.age-o.age; //o.age 树中本来有的
        if(num==0)num = this.name.compareTo(o.name);
        return num; //o是根
    }
}
