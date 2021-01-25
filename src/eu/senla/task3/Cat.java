package eu.senla.task3;

public class Cat {
    public static String catName = "Boris";
    public static int catAge = 7;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.catName = name;
        this.catAge = age;
    }

    public static String getCatName() {
        return catName;
    }

    public static void setCatName(String catName) {
        Cat.catName = catName;
    }

    public static int getCatAge() {
        return catAge;
    }

    public static void setCatAge(int catAge) {
        Cat.catAge = catAge;
    }


}