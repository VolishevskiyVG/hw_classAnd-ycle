package collections;

import java.util.ArrayList;

public class ListCollection {
    public static ArrayList<String> stringList = new ArrayList<>();

    public static void stringList() {
        stringList.add("строчка - 1");
        stringList.add("буква - А");
        stringList.add("слово - Ясень");

        for (String strList : stringList) {
            System.out.print("Здесь находится " + strList + " \n");
        }
        System.out.println();
    }

    public static ArrayList<Integer> intList = new ArrayList<>();

    public static void addIntList() {
        intList.add(59);
        intList.add(-125);
        intList.add(8 * 8);

        for (Integer intList : intList) {
            System.out.print("Здесь отобразилось значение - " + intList + " \n");
        }
        System.out.println();
    }

    public static void deleteIntList() {
        intList.remove(1);
        System.out.println("Остались значения - " + intList.toString());
        System.out.println();
    }


    public static void findStringList() {
        if (stringList.contains("пустота")) {
            System.out.println("Отобразилась буква - А");
        } else {
            System.out.println("Здесь не буква 'А', ищи дальше");
        }
    }
}

