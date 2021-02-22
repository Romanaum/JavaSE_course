package eu.senla.task5;

public class CuboidContainer extends Container {

    private double weight;


    public CuboidContainer(int density, boolean isBig, int height) {
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
