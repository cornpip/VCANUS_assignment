package test_4;

import java.math.BigInteger;

//설명 README 참조
public class Main {
    public static void main(String[] args) {
        String result = factorial(1_000_000, new BigInteger("1"));
        System.out.println(result);
    }

    // 반복으로 구현한 factorial
    static String factorial(Integer x, BigInteger acc) {
        while (x > 1) {
//            System.out.println(x);
            acc = acc.multiply(new BigInteger(String.valueOf(x)));
            x--;
        }
        return acc.toString();
    }
}
