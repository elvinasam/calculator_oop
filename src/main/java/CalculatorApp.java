import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private static Scanner Calc = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 0;
        try { //Обработка исключения по вводу нецелых чисел
            System.out.println("Enter the first number: ");
            firstNum = Calc.nextInt();
            System.out.println("Enter the second number:");
            secondNum = Calc.nextInt();

            System.out.println("Select the order of operation: ");
            char operator = Calc.next().charAt(0);
            double c = 0;

            Calculator calculator = new Calculator(firstNum, secondNum);
            try { //Обработка исключения при делении на 0
                switch (operator) {
                    case '+':
                        c = calculator.add();
                        System.out.println("Answer: " + c);
                        break;

                    case '-':
                        c = calculator.sub();
                        System.out.println("Answer: " + c);
                        break;

                    case '*':
                        c = calculator.mul();
                        System.out.println("Answer: " + c);
                        break;

                    case '/':
                        c = calculator.div();
                        System.out.println("Answer: " + c);
                        break;
                    default:
                        System.out.println("Invalid operation code"); //Обработка исключения ввода неверного оператора
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero ");
            }
        } catch (InputMismatchException ex) {


            System.out.println("The input is not an integer.");
        }
    }

}
