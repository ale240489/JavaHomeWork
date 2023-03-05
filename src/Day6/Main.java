package Day6;

import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в
// java. Создать множество ноутбуков. Написать метод, который будет запрашивать у пользователя
// критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации
// можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
// условиям.
public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Крепыш", 4, 200, "windows", "черный");
        Notebook notebook2 = new Notebook("Супер10", 4, 400, "linux", "белый");
        Notebook notebook3 = new Notebook("Старт", 8, 500, "windows", "черный");
        Notebook notebook4 = new Notebook("Звезда", 8, 200, "windows", "белый");
        Notebook notebook5 = new Notebook("Ракета", 16, 200, "linux", "черный");
        Notebook notebook6 = new Notebook("Радуна", 8, 500, "linux", "белый");
        Notebook notebook7 = new Notebook("Дождик", 32, 200, "windows", "черный");
        Notebook notebook8 = new Notebook("Камень", 16, 1000, "windows", "черный");
        Notebook notebook9 = new Notebook("Молния", 8, 200, "windows", "белый");
        Notebook notebook10 = new Notebook("Бугагашечка", 8, 500, "windows", "черный");

        ArrayList<Notebook> notebooks_list = new ArrayList<>(Arrays.asList(
                notebook1, notebook2, notebook3, notebook4, notebook5, notebook6, notebook7,
                notebook8, notebook9, notebook10));

        Scanner scan = new Scanner(System.in);
        Map<Integer, Object> filter = new HashMap<>();

        //Значения по умолчанию
        filter.put(1,0);
        filter.put(2,0);
        filter.put(3,"черный");
        filter.put(4, "windows");

        boolean finish = false;
        while (!finish) {
            int menu = menu();
            if(menu == 0)
                finish = true;
            // Выбор оперативной памяти
            if (menu == 1) {
                System.out.println("Введите минимальное количество, желаемого, объема оперативной памяти : ");
                int ram_min = scan.nextInt();
                filter.put(menu, ram_min);
            }
            //Выбор жесткого диска
            if (menu == 2) {
                System.out.println("Введите минимальный объем HD : ");
                int HD_min = scan.nextInt();
                filter.put(menu, HD_min);
            }
            //Выбор цвета
            if (menu == 3) {
                System.out.println("Введите '1' - черный.   Введите '2' - белый : ");
                int color_3 = scan.nextInt();
                String finColor = "";
                if (color_3 == 1)
                    finColor = "черный";

                if (color_3 == 2)
                    finColor = "белый";

                filter.put(menu, finColor);
            }
            //Выбор OC
            if (menu == 4) {
                System.out.println("Введите 1 - windows.  Введите 2 - linux : ");
                int color_4 = scan.nextInt();
                String os = "";
                if (color_4 == 1)
                    os = "windows";

                if (color_4 == 2)
                    os = "linux";

                filter.put(menu, os);
            }
        }

        //Создание итогового списка
        ArrayList<Notebook> notebookForClient = new ArrayList<>();
        for (int i = 0; i < notebooks_list.size(); i++) {
            if (notebooks_list.get(i).ram >= (Integer) filter.get(1)
                    && notebooks_list.get(i).hd >= (Integer) filter.get(2)
                    && notebooks_list.get(i).collor.equals(filter.get(3))
                    && notebooks_list.get(i).OS.equals(filter.get(4))) {
                notebookForClient.add(notebooks_list.get(i));
            }
        }
        System.out.println(filter);
        show(notebookForClient);
}
    public static void show(ArrayList list){
        System.out.println("Вашему выбору подходят: ");
        for (Object notebook: list) {
            System.out.println(notebook);
        }
    }
    public static int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Главное Меню \n" +
                "Введите : \n" +
                "1 - для выбора объема оперативной памяти (по умолчанию от 0)\n" +
                "2 - для выбора объема HDD (по умолчанию от 0) \n" +
                "3 - для выбора цвета ноутбука (по умолчанию 'черный') \n" +
                "4 - для выбора операционной системы (по умолчанию 'windows')\n" +
                "--------------------------------------------------------------- \n" +
                "0 - для завершения выбора и вывода итогового списка подходящих моделей");
        int menu = scan.nextInt();
        return menu;
    }
}
