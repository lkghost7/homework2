package by.itacademy.projectshomeworks;

import java.util.Random;

public class HomeWork2Lesson4 {

    public static void main(String[] args) {
        int[] array = new int[5];
        getRandomArray(array, 1, 5);
        int[] distinctArray = new int[array.length];
        boolean indicator;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            indicator = true;
            for (int j = 0; j < counter; j++) {
                if (array[i] == distinctArray[j]) {
                    indicator = false;
                }
            }
            if (indicator == true) {
                distinctArray[counter] = array[i];
                counter++;
            }
        }
        System.out.println("-= Оригинальный массив =-");
        printArray(array);
        System.out.println("\n" + "-= Массив с уникальными числами =-");
        printArray(distinctArray);
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