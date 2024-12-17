public class MathOperation {

    private interface BinaryCalculator {
        public Number calculate(Number a, Number b);
    }

    private static BinaryCalculator plusAgent = (a, b) -> a.doubleValue() + b.doubleValue();
    private static BinaryCalculator minusAgent = (a, b) -> a.doubleValue() - b.doubleValue();

    public static Number add(Number num1, Number num2) {
        return plusAgent.calculate(num1, num2);
    }

    public static Number minus(Number num1, Number num2) {
        return minusAgent.calculate(num1, num2);
    }
}
