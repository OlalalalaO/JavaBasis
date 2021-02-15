package _20210215_集合到文件排序版;

public class Student {
    private String name;
    private int math;
    private int Language;
    private int sum;

    public Student() {
    }

    public Student(String name, int math, int language) {
        this.name = name;
        this.math = math;
        Language = language;
        sum = math + language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLanguage() {
        return Language;
    }

    public void setLanguage(int language) {
        Language = language;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
