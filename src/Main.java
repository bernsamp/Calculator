import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter one number: ");
        double firstNumber = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        System.out.print("Enter another number: ");
        double secondNumber = reader.nextDouble();

        double result;


        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            default -> {
                System.out.print("Error! Operator is not correct");
                return;
            }
        }

        System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }
}