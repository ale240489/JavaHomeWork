import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое этого списка
public class ExampleDay3_3 {
    public static void main(String[] args){
        ArrayList<Integer>array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rnd.nextInt(2,30);
            array.add(num);
        }
        System.out.println(array);
        num_min_max(array);
        average(array);
    }

    public static void num_min_max(ArrayList array){
        Collections.sort(array);
        System.out.println("Минимальное число листа = " + array.get(0) + "\n" +
                            "Максимальное число листа = " + array.get(array.size() - 1));
    }
    public static void average(ArrayList array){
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += (int) array.get(i);
        }
        average = (double)sum/array.size();
        System.out.println("Среднее арифметическое списка = " + average);
    }
}
