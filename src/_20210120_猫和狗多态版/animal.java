package _20210120_猫和狗多态版;

public class animal {
   private String name;
    private int age;
    public animal(){

    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //  alt + insert 键
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
    public void eat(){
        System.out.println("动物吃东西");
    }
}
