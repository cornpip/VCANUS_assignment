package test_3;

public class Main {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    static int factorial(Integer x) {
        if (x > 1) {
            return x * factorial(x - 1);
        } else {
            return x;
        }
    }
}
