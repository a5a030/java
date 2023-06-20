package Part1.ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력받아서 더 큰 수를 입력하세요\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("입력 1:");
        int num1 = scan.nextInt();
        System.out.println("입력 2:");
        int num2 = scan.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}
