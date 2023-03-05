package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class ExampleDay5_1 {
    public static void main(String[] args) {
        System.out.println("Добррый день! Правила \n" +
                "Для того чтобы добавить контакт, введите сначала его ИМЯ \n" +
                "затем введите номер это контакта \n" +
                "для того чтобы добавить номер к уже существующему контакту \n" +
                "сначала повторно введите имя контакта, а за тем \n" +
                "дополнительный номер этого контакта \n" +
                "для завершения работы в графе 'ВВЕДИТЕ ИМЯ' введите 'exit' ");
        System.out.println("----------------------------------");
        addContact();
    }
    public static void addContact () {
        HashMap<String, ArrayList<Integer>> telephonBook = new HashMap<>();
        boolean exit = false;
        while (!exit) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя контакта, если нужно выйти наберите 'exit':");
            String name = scan.nextLine();
            if (name.equals("exit")) {
                System.out.println("До свидания!!! =) ");
                exit = true;
                continue;
            }
            System.out.println("Введите номер контакта : ");
            int number = scan.nextInt();
            if(telephonBook.containsKey(name)){
                List<Integer> list = telephonBook.get(name);
                list.add(number);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(number);
                telephonBook.put(name, (ArrayList<Integer>) list);
            }


            System.out.println(telephonBook);
        }
    }
}
