package collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static HashSet<Integer> intSet = new HashSet<>();

    public static void addIntSet() {
        System.out.println();
        intSet.add(56);
        intSet.add(99);
        intSet.add(265);
        intSet.add(465);
        for (Integer intSet : intSet) {
            System.out.print("Выводит HashSet " + intSet + " \n");
        }
        System.out.println();
    }

    public static void sizeSet() {
        intSet.size();
        System.out.println("Размер HashSet = " + intSet.size());
        System.out.println();
    }

    public static void clearSet() {
        intSet.clear();
        System.out.println("Очищено, размер = " + intSet.size());
        System.out.println();
    }

}


