package eu.senla.task5;

public class Port {

    private Ship ship;


    public Port(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "Port{" +
                "ship=" + ship +
                '}';
    }

}
