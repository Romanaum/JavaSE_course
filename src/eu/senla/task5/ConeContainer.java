package eu.senla.task5;

public class ConeContainer extends Container {

    @Override
    public double getWeight() {
        weight = density * (height / 3) * Math.PI * diagonal * diagonal;
        return weight;
    }
}
