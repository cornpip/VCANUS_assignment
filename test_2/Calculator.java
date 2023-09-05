package test_2;

public class Calculator {
    private Integer result;

    public Integer out() {
        return result;
    }

    public Calculator add(Integer x) {
        result += x;
        return this;
    }

    public Calculator subtract(Integer x) {
        result -= x;
        return this;
    }

    public Calculator() {
        result = 0;
    }
}
