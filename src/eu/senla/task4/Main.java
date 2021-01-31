package eu.senla.task4;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[10][10];
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elem = " ";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j % 3 == 0) {
                    array[i][j] = String.valueOf((double) Math.random() * 10 + 1).substring(0, 6);
                } else {
                    elem = " ";
                    for (int x = 0; x < 6; x++) {
                        int l = (int) (Math.random() * 26);
                        elem = elem + letter.charAt(l);
                    }
                    array[i][j] = elem;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}




