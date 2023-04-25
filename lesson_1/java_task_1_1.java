package lesson_1;
import java.util.Scanner;

public class java_task_1_1 {
    public static void main(String[] args) {
        System.out.println("Enter number n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;            
        }
        System.out.printf("Sum of numbers 1 to %d: %d%n", n, sum);
        System.out.printf("Multiplication of numbers 1 to %d: %d%n", n, mult);
        num.close();
     }
}
