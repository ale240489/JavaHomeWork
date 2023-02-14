//2. Вывести все простые числа от 1 до 1000
public class Example2 {
        public static void main(String[] args) {
            int n = 1000;
            System.out.println("Список простых чисел от 1 до 1000: ");
            isPrimeNum(n);
        }
        public static void isPrimeNum(int n){
            for (int i = 2; i < n; i++) {
                boolean primeNumber = true;
                // проверка на простое число, исключая само себя(j<i)
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primeNumber = false;
                        break; // если не простое то переходим на следующее число
                    }
                }
                // печать простого числа
                if (primeNumber)
                    System.out.print(i + " ");
            }
        }
}
