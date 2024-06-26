// Временная сложность O(log n)

import java.util.Scanner;
public class AndSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            int a = 0;
            int i = n;

            while (i > 0) {
                a += i;
                i /= 2;
            }

            System.out.println("Результат a: " + a);
        }
    }


