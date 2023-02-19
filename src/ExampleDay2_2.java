import java.io.IOException;
import java.util.logging.*;
public class ExampleDay2_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(ExampleDay2_2.class.getName());
        FileHandler handler = new FileHandler("logTask2.xml");
        logger.addHandler(handler);
        XMLFormatter xml = new XMLFormatter();
        handler.setFormatter(xml);
        logger.info("Sorting");
        int [] array = {34, 12, -59, 25, 19, 69, 6};
        printArray(array);
        int[] newArr = Sorting(array);
        System.out.println();
        System.out.print("Отсортированный массив: ");
        System.out.println();
        printArray(newArr);
    }
    public static int[] Sorting(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {

            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
}
