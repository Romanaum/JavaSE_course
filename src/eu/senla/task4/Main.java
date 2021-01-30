package eu.senla.task4;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[10][10];
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int x = 0;

        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[0].length; n++) {
                if (n % 3 == 0) array[i][n] = String.valueOf((double) Math.random() * 10 + 1).substring(0, 6);
                else for (x = 0; x < 6; x++) {
                    array[i][n]="";
                    int l = (int) (Math.random() * 26);
                    System.out.print(letter.charAt(l));
                }

                System.out.print(array[i][n] + " ");
            }

            System.out.println();
        }

    }
}
