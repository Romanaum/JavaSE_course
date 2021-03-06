package eu.senla.task5;


public class CylinderContainer extends Container {

    public CylinderContainer() {
        this.weight = getWeight();
    }

    @Override
    public double getWeight() {
        weight = density * diagonal * diagonal * height * Math.PI;
        return weight;
    }
}
