package collections.print;

import java.util.*;


/**
 * Created by root on 06.09.16.
 *
 * Коллекция: группа отдельных элементов, сформированная по некоторым правилам.
 * Класс List (список) хранит элементы в порядке вставки,
 * в классе Set (множество) нельзя хранить повторяющиеся элементы,
 * а класс Queue (очередь) выдает элементы в порядке, определяемом спецификой очереди
 * (обычно это порядок вставки элементов в очередь).
 *
 * Карта: набор пар объектов «ключ-значение», с возможностью выборки по ключу.
 * ArrayList позволяет искать объекты по порядковым номерам,
 * поэтому в каком-то смысле он связывает числа с объектами.
 * Класс Map (карта — также встречаются термины ассоциативный массив и словарь)
 * позволяет искать объекты по другим объектам — например,
 * получить объект значения по объекту ключа, по аналогии с поиском определения по слову.
 */

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
