package eu.senla.task5;

public class CuboidContainer extends Container {
//
//    private double weight;
//
//    public CuboidContainer(int size) {
//        super(size);
//    }

    @Override
    public double getWeight() {
        weight = density * height * (diagonal * diagonal / 2);
        return weight;
    }
}
