package eu.senla.task5;

public class Deck {
    Container[] containers;
    int number;
    int count = 0;

    public int getDeckSize() {
        if (Math.random() > 0.5) {
            number = 2;
        } else {
            number = 4;
        }
        return number;
    }

    public Deck() {
        containers = new Container[number];
    }

    public void add(Container container) {
        if (count < containers.length) {
            containers[count] = container;
            count++;
        }
    }
    public int getWeight(){
        int weight = 0;
        for (Container cont:containers){
            weight+=cont.getWeight();
        }
        return  weight;
    }
}
