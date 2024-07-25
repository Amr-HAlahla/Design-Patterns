package strategy.calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first value");
        float n1 = Float.parseFloat(br.readLine());
        System.out.println("Enter the second value");
        float n2 = Float.parseFloat(br.readLine());

        System.out.println("Choose the operation to be performed: \n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1: {
                Context context = new Context(new Addition());
                System.out.println(n1 + " + " + n2 + " = " + context.performCalculation(n1, n2));
            }
            break;
            case 2: {
                Context context = new Context(new Subtraction());
                System.out.println(n1 + " - " + n2 + " = " + context.performCalculation(n1, n2));
            }
            break;
            case 3: {
                Context context = new Context(new Multiplication());
                System.out.println(n1 + " * " + n2 + " = " + context.performCalculation(n1, n2));
            }
            break;
            default:
                System.exit(1);
        }
    }
}
