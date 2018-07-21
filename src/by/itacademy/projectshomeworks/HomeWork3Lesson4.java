package by.itacademy.projectshomeworks;

public class HomeWork3Lesson4 {

    public static void main(String[] args) {
        int[] arrayFirst = {1, 2, 3, 4, 5};
        int[] arraySecond = {5, 7, 9};
        int[] resultArray = arrayToArray(arrayFirst, arraySecond);
        System.out.println("Первый массив");
        printArray(arrayFirst);
        System.out.println("\n" + "Второй массив");
        printArray(arraySecond);
        System.out.println("\n" + "Результат слияния массивов");
        printArray(resultArray);
    }

    private static int[] arrayToArray(int[] arrayFirst, int[] arraySecond) {
        int counter = 0;
        int[] arrayToArray = new int[arrayFirst.length + arraySecond.length];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayToArray[counter] = arrayFirst[i];
            counter++;
            if (i < arraySecond.length) {
                arrayToArray[counter] = arraySecond[i];
                counter++;
            }
        }
        return arrayToArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(" | " + element);
        }
    }
}