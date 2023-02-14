//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//(произведение чисел от 1 до n)

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 'n': ");
        int n = scan.nextInt();
        System.out.println("n-ное треугольное число = " + triangularNumber(n));
        System.out.println();
        System.out.println("Произведение чисел от 1 до 'n' = "+ composition(n));
    }
    public static int triangularNumber (int n){
        int triangularNumber = 0;
        for(int i = 1; i <= n; i++){
            triangularNumber += i;
        }
        return triangularNumber;
    }

    public static int composition (int n){
        int composition = 1;
        for(int i = 1; i <= n; i++){
            composition *= i;
        }
        return composition;
    }
}

