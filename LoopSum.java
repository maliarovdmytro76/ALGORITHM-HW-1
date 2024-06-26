
// Временная сложность O(n^2)
import java.util.Scanner;
public class LoopSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            int a = 0;

            for (int i = 0; i < n; i++) {
                for (int j = n; j > i; j--) {
                    a = a + i + j;
                }
            }

            System.out.println("Результат a: " + a);
        }
    }


