import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1, n2;
        char operation;
        double result=0;
        Scanner sc= new Scanner(System.in);
        boolean continueCalculating = true;  // it controls whether the calculator program has to stop or keep running.

        while(continueCalculating) {
            System.out.println("Enter the first number: ");
            n1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            n2 = sc.nextDouble();

            System.out.println("Enter the operator (+,-, *, /): ");
            operation = sc.next().charAt(0);  // .next() means to read the next word that is entered by the user as a String and .charAt(0) means that it gets the first character of that string.

            try {
                switch (operation) {
                    case '+':
                        result = CalculatorMethods.add(n1, n2);
                        break;
                    case '-':
                        result = CalculatorMethods.subtract(n1, n2);
                        break;
                    case '*':
                        result = CalculatorMethods.multiplication(n1, n2);
                        break;
                    case '/':
                        result = CalculatorMethods.divide(n1, n2);
                        break;

                    default:
                        System.out.println("Invalid operation");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Want to perform another calculation? (Y/N)");
            String userChoice = sc.next();  // for stooping the loop and asks from the user to perform another operation or not
            if (userChoice.equalsIgnoreCase("N")) {
                continueCalculating = false;
            }
        }
    }
}