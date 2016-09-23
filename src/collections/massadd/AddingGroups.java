package collections.massadd;

import java.util.*;

/**
 * метод Arrays.asList() получает либо массив, либо список элементов, разделенных запятыми, и преобразует его в объект List
 *
 * метод Collections.addAll() получает объект Collection и либо массив, либо список, разделенный запятыми,
 * и добавляет элементы в Collection
 */

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        // Работает намного быстрее, но таким способом
        // невозможно сконструировать Collection:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);// Можно - изменение элемента
        // list.add(21); // Ошибка времени выполнения - нижележащий
        // массив не должен изменяться в размерах
    }
}