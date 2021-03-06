package eu.senla.task5;

public class Deck {
    Container[] containers;
    int number;
    int count = 0;
    int deckSize;
    int weight;


    public Deck() {
        this.deckSize = getDeckSize();
        containers = new Container[number];
//        this.weight=getWeight();
    }

    public int getDeckSize() {
        if (Math.random() > 0.5) {
            number = 2;
        } else {
            number = 4;
        }
        return number;
    }

    public boolean add(Container container) {
        if (count < containers.length) {
            containers[count] = container;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public int getWeight() {
        int weight = 0;
        for (Container cont : containers) {
            weight += cont.getWeight();
        }
        return weight;
    }
}
