package lesson_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_task_1_2 {
    public static void main(String[] args) {
        System.out.print("Enter positive number: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
       
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber == true) {
                arr.add(i);
            }
        }
        System.out.println("Prime numbers " + arr);
        num.close();
    }
}
