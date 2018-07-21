package by.itacademy.projectshomeworks;

public class HomeWork2Lesson5 {

    public static void main(String[] args) {

        String[][] arrayCompareNumbers =
                {
                        {"I", "1"}, {"II", "2"}, {"III", "3"}, {"IV", "4"}, {"V", "5"},
                        {"VI", "6"}, {"VII", "7"}, {"VIII", "8"}, {"IX", "9"}, {"X", "10"},
                        {"XI", "11"}, {"XII", "12"}, {"XIII", "13"}, {"XIV", "14"}, {"XV", "15"},
                        {"XVI", "16"}, {"XVII", "17"}, {"XVIII", "18"}, {"XIX", "19"}, {"XX", "20"},
                        {"XXI", "21"}, {"XXX", "30"}, {"XL", "40"}, {"L", "50"}, {"LX", "60"},
                        {"LXX", "70"}, {"LXXX", "80"}, {"XC", "90"}, {"C", "100"}, {"CC", "200"},
                        {"CCC", "300"}, {"CD", "400"}, {"D", "500"}, {"DC", "600"}, {"DCC", "700"},
                        {"DCCC", "800"}, {"CM", "900"}, {"M", "1000"}, {"MM", "2000"}, {"MMM", "3000"},
                        {"MMMIM", "3999"}
                };
        String romamNumber = "MMMIV";
        String tempToScreen = romamNumber;
        int arabicNumber = getArabicNumber(romamNumber, arrayCompareNumbers);
        System.out.println("Римское число " + tempToScreen + " = " + arabicNumber);
    }

    private static int getArabicNumber(String romanNumber, String[][] arrayCompare) {
        int arabicNumber = 0;
        for (int i = arrayCompare.length - 1; i >= 0; i--) {
            if (arrayCompare[i][0].length() <= romanNumber.length()) {
                if (arrayCompare[i][0].equals(romanNumber.substring(0, arrayCompare[i][0].length()))) {
                    arabicNumber = arabicNumber + Integer.parseInt(arrayCompare[i][1]);
                    romanNumber = romanNumber.replaceFirst(romanNumber.substring(0, arrayCompare[i][0].length()), "");
                }
            }
        }
        return arabicNumber;
    }
}