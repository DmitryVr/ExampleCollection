package collections.set;

import java.util.*;

/**
 * Set хранит неповторяющиеся значения
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("HashSet:");
        hashSetExample(); // порядок не такой же как при вставке
        System.out.println("------------------");

        System.out.println("TreeSet");
        treeSetExample(); // автоматическая сортировка
        System.out.println("------------------");

        System.out.println("LinkedHashSet");
        linkedHashSetExample(); // сохраняет порядок вставки
        System.out.println("------------------");



    }

    public static void hashSetExample() {

        Set<Car> cars = new HashSet();

        Car car1 = new Car("Nissan");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Honda");
        Car car4 = new Car("Honda");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName());

        }

    }

    public static void treeSetExample() {

        Set<Integer> tree = new TreeSet();
        tree.add(1);
        tree.add(22);
        tree.add(345);
        tree.add(-43);
        tree.add(22);
        tree.add(4568);

        Iterator<Integer> iterator = tree.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");

        }

    }

    public static void linkedHashSetExample() {

        Set<Car> set = new LinkedHashSet();
        set.add(new Car("Reno"));
        set.add(new Car("Reno"));
        set.add(new Car("Porsche"));
        set.add(new Car("Reno"));
        set.add(new Car("Mazda"));

        Iterator<Car> iterator = set.iterator();
        while (iterator.hasNext()) {

            Car car = iterator.next();
            System.out.println(car.getName());

        }

    }
}
