package eu.senla.task3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        int counter = 0;

// first cycle with while

        while (counter < 10) {
            System.out.println("Cat name: " + cat.catName);
            System.out.println("Cat age: " + cat.catAge);
            counter++;
        }
        counter = 0;

// second cycle with for
        for (counter = 0; counter < 10; counter++) {
            System.out.println("Cat name: " + cat.getCatName());
            System.out.println("Cat age: " + cat.getCatAge());
        }

//third cycle with do and while
//     В лекциях лектор употребляет слово конструктор к записи "concreteObject", что это ?
/*
        Cat concreteObject = new Cat();
        do {
            counter++;
            System.out.println("Cat name: " + concreteObject.getCatName());
            System.out.println("Cat age: " + concreteObject.getCatAge());
        } while (counter < 10);
*/
        counter = 0;

        Cat cat1 = new Cat("Humus", 3);
        do {
            counter++;
            System.out.println("Cat name: " + cat1.name);
            System.out.println("Cat age: " + cat1.age);
        } while (counter < 10);


//fourth cycle with foreach

        String[] name = {"Panda", "Tik", "Tok", "Tom", "Leo"};
        int[] age = {5, 4, 7, 3, 2};
        int n = 0;
        Cat[] catArray = new Cat[5];
        for (Cat cat2 : catArray) {
            cat2 = new Cat(name[n], age[n]);
            System.out.println("Cat name: " + name[n]);
            System.out.println("Cat age: " + age[n]);
            n++;
        }
    }
}
