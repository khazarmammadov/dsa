package dsa.hashTable;


public class Main {
    public static void main(String[] args) {

        Table table = new Table(5);

        table.insert(1,"Khazar");
        table.insert(21,"Joel");
        table.insert(13,"Ellie");
        table.insert(14,"Tess");
        table.insert(10,"Stan");
        table.insert(15,"Lucifer");
        table.insert(17,"Tina");

        System.out.println(table.arr[4].next.key + "  " + table.arr[4].next.name);

    }
}
