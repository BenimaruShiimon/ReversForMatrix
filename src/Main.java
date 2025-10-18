import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] color = new int[SIZE][SIZE];
        int[][] rotatedColor = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                color[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Дана следующая матрица: ");
        getPrint(color);
        System.out.println("Выбери степень переворота: " + " 90 градусов " + " 180 градусов " + " 270 градусов ");
        int input = scanner.nextInt();
        switch (input) {
            case 90:
                System.out.println("Вы выбрали переворот на 90 гардусов!\n" + "Переворот: ");
                reversed90(color, rotatedColor);
                getPrint(rotatedColor);
                break;
            case 180:
                System.out.println("Вы выбрали переворот на 180 гардусов!\n" + "Переворот: ");
                reversed180(color, rotatedColor);
                getPrint(rotatedColor);
                break;
            case 270:
                System.out.println("Вы выбрали переворот на 270 гардусов!\n" + "Переворот: ");
                reversed270(color, rotatedColor);
                getPrint(rotatedColor);
                break;
        }
        scanner.close();
    }

    public static void getPrint(int[][] color) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", color[i][j]);
            }
            System.out.println();
        }
    }

    public static void reversed90(int[][] color, int[][] rotatedColor) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColor[j][SIZE - 1 - i] = color[i][j];
            }
        }
    }

    public static void reversed180(int[][] color, int[][] rotatedColor) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColor[SIZE - 1 - i][SIZE - 1 - j] = color[i][j];
            }
        }
    }

    public static void reversed270(int[][] color, int[][] rotatedColor) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColor[SIZE - 1 - j][i] = color[i][j];
            }
        }
    }
}