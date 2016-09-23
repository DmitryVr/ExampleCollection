package collections.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * queue
 */
public class Start {

    public static void main(String[] args) {

        // ограничение на количество элементов
        //Queue<Car> cars = new ArrayBlockingQueue<Car>(5);

        Deque<Car> cars = new ArrayDeque<Car>(); // FIFO
        Queue<Car> cars1 = new ArrayDeque<Car>();

        Car car1 = new Car("Nissan", 1999);
        Car car2 = new Car("BMW", 2001);
        Car car3 = new Car("Mazda", 2005);
        Car car4 = new Car("Lexus", 1997);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);


        cars1.add(car1);
        cars1.add(car2);



        // FIFO
       // System.out.println(cars.element()); // получение верхнего элемента без удаления из очереди
       // System.out.println(cars.remove()); // получение верхнего элемента с удалением из очереди


//        Queue lifoQueue = Collections.asLifoQueue(cars); // LIFO
//
//        lifoQueue.add(car1);
//        lifoQueue.add(car2);
//        lifoQueue.add(car3);
//        lifoQueue.add(car4);
//
//        System.out.println(lifoQueue.element()); // получение верхнего элемента без удаления из очереди
//        System.out.println(lifoQueue.remove()); // получение верхнего элемента с удалением из очереди


    }

}
