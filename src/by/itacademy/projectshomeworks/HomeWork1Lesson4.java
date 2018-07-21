package by.itacademy.projectshomeworks;

import java.util.Random;

public class HomeWork1Lesson4 {

    public static void main(String[] args) {
        int[] array = new int[12];
        getRandomArray(array, 1, 7);
        System.out.println("\n" + "-= Оригинальный массив =-");
        printArray(array);
        int[] mirrorArray = new int[array.length];
        cicleArray(array, mirrorArray);
        System.out.println("\n" + "-= Массив со сдвигом =-");
        printArray(mirrorArray);
    }

    private static void cicleArray(int[] array, int[] mirrorArray) {
        for (int i = 0; i < array.length; i++) {
            mirrorArray[(i + 1) % array.length] = array[i];
        }
    }

    private static void getRandomArray(int[] array, int fromInt, int toInt) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(toInt - fromInt + 1) + fromInt;
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(" | " + element);
        }
    }
}