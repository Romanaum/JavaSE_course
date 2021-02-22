package eu.senla.task5;

public class Port {

    int count = 0;

    Ship[] capacity = new Ship[10];

    public boolean add(Ship ship) {
        if (count < capacity.length) {
            capacity[count] = ship;
            count++;
            return true;
        } else {
            return false;

        }
    }
}
