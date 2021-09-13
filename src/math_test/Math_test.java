package math_test;

import java.util.Random;
import java.util.Scanner;

public class Math_test{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int r = 0;

        for (int i = 0; i < 5; i++) {    
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            System.out.print(a + "*" + b + "=");
            int c = scanner.nextInt();

            if (a*b == c) {
                System.out.println("Правильно");
                r++;
            }else{
                System.out.println("Неправильно");
            }
        }
        System.out.println("Вы ответили правильно на " + r + " из 5 примеров");
    }
}