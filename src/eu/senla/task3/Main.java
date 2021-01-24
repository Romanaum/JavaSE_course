package eu.senla.task3;

import eu.senla.task2.Rainbow;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        int counter = 0;

// first cycle with while
        /*
        while (counter < 10) {
            System.out.println("Cat name: " + cat.catName);
            System.out.println("Cat age: " + cat.catAge);
            counter++;
        }

// second cycle with for
        for (counter = 0; counter < 10; counter++) {
            System.out.println("Cat name: " + cat.getCatName());
            System.out.println("Cat age: " + cat.getCatAge());
        }
        */
//third cycle with do and while

        /*
        Cat concreteObject = new Cat();
        do {
            counter++;
            System.out.println("Cat name: " + concreteObject.getCatName());
            System.out.println("Cat age: " + concreteObject.getCatAge());
        } while (counter < 10);
        */
//fourth cycle with foreach


    }
}
