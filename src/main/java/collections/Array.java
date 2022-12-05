package collections;

import java.util.Arrays;

public class Array {

    public static String[] stringsArray = {
            "Saturday",
            "Sunday",
            "Thursday",
            "Friday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday"

    };

    public static void findDayWeek() {
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i] == "Thursday") {
                System.out.println("День недели нашли - " + stringsArray[i]);
                break;
            }
            System.out.println("Перебираем дальше");

        }

    }

    public static void findDayWeekNext() {
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i] == "Saturday") {
                continue;
            }
            System.out.println("День недели " + stringsArray[i] + " найден - конец");
            return;
        }

    }


    public static void sortDay() {
        Arrays.sort(stringsArray);
        System.out.println(Arrays.toString(stringsArray));
    }
}
