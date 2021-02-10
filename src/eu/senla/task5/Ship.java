package eu.senla.task5;

public class Ship {

    private Deck deck;

    public Ship(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "deck=" + deck +
                '}';
    }
}
