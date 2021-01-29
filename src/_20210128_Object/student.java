package _20210128_Object;

public class student extends Object{
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
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
     * 重写了object中的tostring()方法
     * @return
     */
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    } //可以直接输出s
    //写类的时候重写tostring()方法

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student student = (student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }*/
}
