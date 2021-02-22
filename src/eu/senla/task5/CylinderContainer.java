package eu.senla.task5;


public class CylinderContainer extends Container {
//    public CylinderContainer(int size) {
//        super(size);
//    }

    @Override
    public double getWeight() {
        weight = density * diagonal * diagonal * height * Math.PI;
        return weight;
    }
}
