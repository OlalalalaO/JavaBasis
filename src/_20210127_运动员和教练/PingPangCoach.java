package _20210127_运动员和教练;

public class PingPangCoach extends Coach implements SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓教练吃白菜");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
