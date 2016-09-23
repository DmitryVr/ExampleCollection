package collections.map;

import java.util.*;

/**
 * Map
 */
public class Start {

    public static void main(String[] args) {

        Car fd = new Car("Abv");
        System.out.println(fd.getClass());

        HashMap<String, Car> hashMap = new HashMap<String, Car>();
        hashMap.put("test", new Car("Nissan"));
        hashMap.put("key", new Car("Lexus"));
        hashMap.put("car", new Car("Ford"));
        hashMap.put("bmw", new Car("BMW"));
        System.out.println(hashMap.get("bmw")); // получить значение по ключу
        iterateMap(hashMap); // порядок вставки не сохраняется

        TreeMap<String, Car> treeMap = new TreeMap<String, Car>();
        treeMap.put("test", new Car("Nissan"));
        treeMap.put("key", new Car("Lexus"));
        treeMap.put("car", new Car("Ford"));
        treeMap.put("bmw", new Car("BMW"));
        treeMap.put("key", new Car("Hammer")); // дублированный ключ, происходит замена
        iterateMap(treeMap); // сортировка по ключам

        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<String, Car>();
        linkedHashMap.put("test", new Car("Nissan"));
        linkedHashMap.put("key", new Car("Lexus"));
        linkedHashMap.put("car", new Car("Ford"));
        linkedHashMap.put("bmw", new Car("BMW"));
        iterateMap(linkedHashMap); // сохранен порядок вставки

        // 2
        for (String key : linkedHashMap.keySet()) {
            System.out.println(linkedHashMap.get(key));
        }

        // 3
        for (Map.Entry<String, Car> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }

    private static void iterateMap(Map map) {

        // итераторы:

        // 1
        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + "-" + carEntry.getValue());
            //iterator.remove(); // удалить элемент
        }
    }
}
