package eu.senla.task5;

abstract class Container {

    private final int density1 = 1000;
    private final int density2 = 2000;
    boolean isBig;
    int height;
    int density;

    public abstract double getWeight();

    public Container(int density, boolean isBig, int height) {
        this.isBig = isBig;
        if (height >= 10 || height <= 100) {
            this.height = height;
        } else System.out.println("Print value from 10 to 100 ");

        if (density == density1 || density == density2) {
            this.density = density;
        } else System.out.println("Print value 1000 or 2000 ");
    }

}
