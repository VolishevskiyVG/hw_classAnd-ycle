import collections.Array;
import collections.ListCollection;
import collections.MapCollection;
import collections.SetCollection;

public class HwCollections {
    public static void main(String[] args) {
        //Работа с list
        ListCollection.stringList();
        ListCollection.addIntList();
        ListCollection.deleteIntList();
        ListCollection.findStringList();
        // работа с set
        SetCollection.addIntSet();
        SetCollection.sizeSet();
        SetCollection.clearSet();
        // работа с map
        MapCollection.addBirthMap();
        MapCollection.deliteBirthMap();
        MapCollection.keyValueBirth();
        // работа с массивом
        Array.findDayWeek();
        Array.findDayWeekNext();
        Array.sortDay();
    }
}
