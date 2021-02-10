package eu.senla.task4;

import java.util.Arrays;

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

    public String[] mainDiagonal(String[][] array) {
        String[] mainDiagonal = new String[10];
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            mainDiagonal[i] = array[i][j];
            i++;
            System.out.print(mainDiagonal[i]);
        }

        return mainDiagonal;
    }

    public String[] sideDiagonal(String[][] array) {
        String[] mainDiagonal = new String[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    mainDiagonal[i] = array[i][j];
                    System.out.println(array[i][j] + " ");
                }
            }
        }
        return mainDiagonal;
    }
}




