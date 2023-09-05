package test_2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Integer result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(String.valueOf(result));
    }
}