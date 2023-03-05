package Day6;

public class Notebook {
    String name;
    int ram;
    int hd;
    String OS;
    String collor;

    public Notebook(String name, int ram, int hd, String OS, String collor) {
        this.name = name;
        this.ram = ram;
        this.hd = hd;
        this.OS = OS;
        this.collor = collor;
    }

    @Override
    public String toString() {
        return
                "Наименование: " + name +
                " | ОЗУ: " + ram +
                " | HDD: " + hd +
                " | Операционная система: " + OS +
                " | Цвет: " + collor;
    }
}
