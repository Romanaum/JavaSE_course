package eu.senla.task2;

public class Rainbow {

    private static final int Red = 1;

    private static final int Orange = 2;
    private static final int Yellow = 3;
    private static final int Green = 4;
    private static final int Blue = 5;
    private static final int Indigo = 6;
    private static final int Violet = 7;


    public void printColor(int rainbowColor) {

        switch (rainbowColor) {
            case Red:
                System.out.println("Red");
                break;
            case Orange:
                System.out.println("Orange");
                break;
            case Yellow:
                System.out.println("Yellow");
                break;
            case Green:
                System.out.println("Green");
                break;
            case Blue:
                System.out.println("Blue");
                break;
            case Indigo:
                System.out.println("Indigo");
                break;
            case Violet:
                System.out.println("Violet");
                break;

        }
    }

}
