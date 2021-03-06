package eu.senla.task5;

public class Main {
    public static void main(String[] args) {

//        Port port = new Port();
//        Ship ship;
        Container container = null;
        Deck deck = new Deck();
        do {
            int randomNumber = (int) (Math.random() * 3);
            switch (randomNumber) {
                case 0:
                    container = new ConeContainer();
                    break;
                case 1:
                    container = new CylinderContainer();
                    break;
                case 2:
                    container = new CuboidContainer();
                    break;

            }
        } while (deck.add(container));
        System.out.println(deck.getWeight());


//        do {
//            ship = new Ship();
//            do {
//                deck = new Deck();
//                do {
//                    int randomNumber = (int) (Math.random() * 3);
//                    switch (randomNumber) {
//                        case 0:
//                            container = new ConeContainer();
//                            break;
//                        case 1:
//                            container = new CylinderContainer();
//                            break;
//                        case 2:
//                            container = new CuboidContainer();
//                            break;
//                        default:
//                            container = new CuboidContainer();
//                            break;
//                    }
//                } while (deck.add(container));
//            } while (ship.add(deck));
//        } while (port.add(ship));
//        System.out.println();

//        Deck deck = new Deck();
//            int randomNumber = (int) (Math.random() * 3);
//            switch (randomNumber) {
//                case 0:
//                    container = new ConeContainer();
//                    break;
//                case 1:
//                    container = new CylinderContainer();
//                    break;
//                case 2:
//                    container = new CuboidContainer();
//                    break;
//
//            }
    }
}