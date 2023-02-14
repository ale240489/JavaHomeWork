//3. Реализовать простой калькулятор
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();

        System.out.println("Введите математический знак: ");
        String c = scan.next();

        System.out.println("Введите второе число: ");
        int b = scan.nextInt();

        System.out.println(a + " " + c + " " + b + " = " + calculator(a, b, c));
    }
    public static int calculator (int a, int b, String c){
        int x = 0;
        if(c.equals("+"))
            x = a + b;
        if(c.equals("-"))
            x = a - b;
        if(c.equals("*"))
            x = a * b;
        if(c.equals("/"))
            x = a / b;
        return x;
    }
}
