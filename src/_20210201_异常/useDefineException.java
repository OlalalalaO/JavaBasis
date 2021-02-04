package _20210201_异常;

public class useDefineException {
    public void checkScore(int score)throws defineException{ //这里是throws
        if(score<0||score>100){
            throw new defineException("你给的分数有误"); //抛出异常,这里是throw
        }else System.out.println("分数正常");
    }
}
