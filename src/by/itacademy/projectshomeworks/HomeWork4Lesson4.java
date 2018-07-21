package by.itacademy.projectshomeworks;

public class HomeWork4Lesson4 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}};
        int[] resultArray = linearize(array);
        printArray(resultArray);
    }

    private static int[] linearize(int[][] array) {
        int counter = 0;
        int lenghtArray = 0;
        for (int[] index : array) {
            lenghtArray = lenghtArray + index.length;
        }
        int[] arrayMerge = new int[lenghtArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayMerge[counter] = array[i][j];
                counter++;
            }
        }
        return arrayMerge;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(" | " + element);
        }
    }
}