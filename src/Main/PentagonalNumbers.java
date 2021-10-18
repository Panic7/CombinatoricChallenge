package Main;

public class PentagonalNumbers {
    private Integer num;

    public PentagonalNumbers() {
        num = null;
    }

    public Integer getNum() {
            return num;
    }

    public void setNum(int num) {
        if (num > 0) this.num = num;
        else System.out.println("Incorrect variable value");
    }

    public Integer CombinatoricsChallenge(Integer num) {
        if(num == null) return null;
        return (int) (1 + (5 / 2.0 * num * (num - 1)));
    }

}
