package eu.senla.task5;

abstract class Container {

    private final int density1 = 1000;
    private final int density2 = 2000;
    int big=20;
    int small=10;
    int diagonal;
    int size;
    int height;
    int density;
    double weight;

    public Container() {
        this.size = getSize();
        //this.diagonal = getDiagonal();
        this.height = getHeight();
        this.density = getDensity();
    }

    public abstract double getWeight();

    public int getSize() {

//        if (this.size == 1) {
//            diagonal = 10;
//        }
//        else if (this.size==2){
//            diagonal=20;
//        }
        if (Math.random() > 0.5) {
            diagonal = small;
        } else {
            diagonal = big;
        }
        return diagonal;
    }

    public int getHeight() {
        height = (int) (10 + Math.random() * 90);
        return height;
    }

    public int getDensity() {
        if (Math.random() > 0.5) {
            density = density1;
        } else {
            density = density2;
        }
        return density;
    }


}
