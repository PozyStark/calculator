import java.util.Scanner;

/**
 * @author PKomarov
 */

public class Main {

    /**
     * @author PKomarov
     * @param operator accept the operator +, -, *, /
     * @param a accept the float variable
     * @param b accept the float variable
     * @return calculated operation between a and b
     * @throws OperatorException if operator not recognized throw the OperatorException
     */
    public static float calculate(String operator, float a, float b) throws OperatorException {
        if (operator.equals("+")) {
            return a + b;
        }
        if (operator.equals("-")) {
            return a - b;
        }
        if (operator.equals("*")) {
            return a * b;
        }
        if (operator.equals("/")) {
            return a / b;
        }
        throw new OperatorException("Operator not recognized", operator);
    }

    public static void calculatorFlow(Scanner scanner) throws OperatorException {
        System.out.print("Choose operator (+, -, *, /):");
        String operator = scanner.next();
        System.out.print("a=");
        float a = scanner.nextFloat();
        System.out.print("b=");
        float b = scanner.nextFloat();
        System.out.printf("%.4f + %.4f = %.4f", a, b, calculate(operator, a, b));

        scanner.close();
    }

    public static void massiveFlow(Scanner scanner) {
        System.out.print("Enter size:");
        int size = scanner.nextInt();

        String []words = new String[size];

        for (int i=0; i<size; i++) {
            System.out.printf("Enter the %d word:", i+1);
            words[i] = scanner.next();
        }

        scanner.close();

        String longestWord = "";
        for (int i=0; i < size; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.printf("Longest word is: %s", longestWord);
    }

    public static void main(String[] args) throws OperatorException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of task (1 - calculator, 2 - string array):");
        int flowNumber = scanner.nextInt();
        if (flowNumber == 1) {
            calculatorFlow(scanner);
        }
        if (flowNumber == 2) {
            massiveFlow(scanner);
        }
    }
}
