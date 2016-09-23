package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * List
 */
public class Start {

    public static void main(String[] args) {

        //arrayListTest();
        System.out.println("----------------");
        linkedListTest();

    }

    public static void arrayListTest() {

        ArrayList<Car> cars = new ArrayList();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("BMW");
        Car car4 = new Car("Lexus");
        Car car5 = new Car("Lexus");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.add(new Car("Hammer")); // создание объекта в месте добавления

        System.out.println("cars.size() = " + cars.size()); // размер коллекции
        System.out.println("cars.contains(car2) = " + cars.contains(car2)); // содержит ли коллекция объект
        int index = cars.indexOf(car5);
        System.out.println("cars.indexOf(car5) = " + index); // узнать индекс
        System.out.println("cars.get(4) = " + cars.get(4).getName()); // получить элемент по индексу

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear(); // очистка коллекции
        System.out.println("cars.isEmpty() = " + cars.isEmpty()); // пуста ли коллекция

    }

    public static void linkedListTest() {

        LinkedList<Car> cars = new LinkedList();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("BMW");
        Car car4 = new Car("Lexus");
        Car car5 = new Car("Lexus");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.addLast(car1); // добавить в конец
        System.out.println("--" + cars.removeFirst());

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

//        cars.addFirst(car1); // добавить в начало
//        cars.addLast(car1); // добавить в конец
//        cars.removeFirst(); // удалить первый
//        cars.removeLast(); // удалить последний

//        Iterator<Car> iterator = cars.descendingIterator(); // итератор в обратную сторону
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().getName());
//        }

    }

}
