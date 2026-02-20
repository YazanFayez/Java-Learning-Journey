public class TestClac {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.read();
        double result = calc.compute();
        if (Double.isNaN(result))
            System.out.print("You CANNOT divide by ZERO!!");
        else
            System.out.printf("%.2f %c %.2f = %.2f", calc.getOperand1(), calc.getOperator(), calc.getOperand2(), result);
    }
}
