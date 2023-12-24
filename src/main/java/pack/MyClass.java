package pack;

public class MyClass {
    private final Object score;
    private final double credit;

    public MyClass(Object score, double credit) {
        this.score = score;
        this.credit = credit;
    }

    public Object getScore() {
        return score;
    }

    public double getCredit() {
        return credit;
    }

}
