package eu.senla.task5;

public class ConeContainer extends Container {

    private double weight;


    public ConeContainer(int density, boolean isBig, int height) {
        super(density, isBig, height);
    }

    @Override
    public double getWeight() {
        if (isBig) {
            weight = density * (height / 3) * 3.1415 * 10 * 10;
        } else weight = density * (height / 3) * 3.1415 * 5 * 5;
        return weight;
    }
}
