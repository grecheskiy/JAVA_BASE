import java.util.Scanner;

public class java_task_1_4 {
    public static void main(String[] args) {

        System.out.println("\n\n Задано выражение: 2? + ?5 = 69 . Восстановить выражение до верного равенства.");
        System.out.println("Enter number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
    
        if (20 + num + num * 10 + 5 == 69) {            
        System.out.println("2" + num + " + " + num + "5" + " = 69");
        }
        else { System.out.println("Error");
        }
        n.close();
    }
}    
