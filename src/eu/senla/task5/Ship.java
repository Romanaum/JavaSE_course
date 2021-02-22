package eu.senla.task5;

public class Ship {
    Deck[] decks;
    private int count = 0;
    int number;

    public int getShipSize() {
        if (Math.random() > 0.5) {
            number = 2;
        } else {
            number = 4;
        }
        return number;
    }

    public Ship() {
        decks = new Deck[number];
    }

    public boolean add(Deck deck) {
        if (count < decks.length) {
            decks[count] = deck;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public int getWeight() {
        int weight = 0;
        for (Deck deck : decks) {
            weight += deck.getWeight();
        }
        return weight;
    }
}

