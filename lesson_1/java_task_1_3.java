package lesson_1;
import java.util.Scanner;

public class java_task_1_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    System.out.println("Enter first number: ");
    Scanner n1 = new Scanner(System.in);
    int num1 = n1.nextInt();

    System.out.println("Enter operation :");
    char op = scanner.next().charAt(0);
    
    System.out.println("Enter second number: ");
    Scanner n2 = new Scanner(System.in);
    int num2 = n2.nextInt();

    int result = 0;
    switch (op){
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        }
System.out.println("Result of operation : " + result);
n1.close();
n2.close();
}
}
