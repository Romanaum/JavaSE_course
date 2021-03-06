package eu.senla.task5;

public class CuboidContainer extends Container {

    public CuboidContainer() {
        this.weight = getWeight();
    }

    @Override
    public double getWeight() {
        weight = density * height * (diagonal * diagonal / 2);
        return weight;
    }
}
