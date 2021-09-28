package math_test;

import java.util.Random;
import java.util.Scanner;

public class Math_test{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rightAnswers = 0;

        for (int i = 0; i < 5; i++) {    
            int firstint = random.nextInt(10);
            int secint = random.nextInt(10);
            System.out.print(firstint + "*" + secint + "=");
            int result = scanner.nextInt();

            if (firstint*secint == result) {
                System.out.println("\u001b[32mПравильно");
                rightAnswers++;
            }else{
                System.out.println("\u001b[31mНеправильно");
            }
        }
        
        System.out.println("Вы ответили правильно на " + rightAnswers + " из 5 примеров");
        System.out.println("Ваша оценка - " + rightAnswers);
    }
}