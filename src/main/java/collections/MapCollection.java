package collections;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static HashMap<Integer, String> birthMap = new HashMap<>();

    public static void addBirthMap() {
        birthMap.put(1, " Dasha 28.02.1994");
        birthMap.put(2, " Pasha 5.02.1994");
        birthMap.put(3, " Vova 5.03.1992");
        birthMap.put(4, " Oleg 3.05.1995");
        birthMap.put(5, " Dima 21.07.1996");
        System.out.println(birthMap);
        System.out.println();

    }

    public static void deliteBirthMap() {
        birthMap.remove(2);
        System.out.println("Удален элемент c ключом 2 остались - " + birthMap);
        System.out.println();
    }

    public static void keyValueBirth() {
        addBirthMap();
        for (Map.Entry<Integer, String> entry : birthMap.entrySet()) {
            System.out.println("Ключ : " + entry.getKey() + ", Значение : " + entry.getValue());
        }
        System.out.println();

    }

}

