import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.println("=== КАЛЬКУЛЯТОР ===");

        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        operator = scanner.next();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        if (operator.equals("+")) {
            System.out.println("Результат: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Результат: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Результат: " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Деление на 0 запрещено");
            } else {
                System.out.println("Результат: " + (num1 / num2));
            }
        } else {
            System.out.println("Неизвестная операция. Возможно мы её ещё не добавили, но добавим в будующем.");
        }

        scanner.close();
    }
}