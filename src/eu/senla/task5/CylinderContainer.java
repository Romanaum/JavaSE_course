package eu.senla.task5;


public class CylinderContainer extends Container {

    private double weight;


    public CylinderContainer(int density, boolean isBig, int height) {
        super(density, isBig, height);
    }

    @Override
    public double getWeight() {
        if (isBig) {
            weight = density * 10 * 10 * height * 3.1415;
        } else weight = density * 5 * 5 * height * 3.1415;
        return weight;
    }
}
