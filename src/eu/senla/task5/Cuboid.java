package eu.senla.task5;

public class Cuboid extends Container {

    private double weight;


    public Cuboid(int density, boolean isBig, int height) {
        super(density, isBig, height);
    }

    @Override
    public double getWeight() {
        if (isBig) {
            weight = density * height * (20 * 20 / 2);
        } else weight = density * height * (10 * 10 / 2);
        return weight;
    }
}
