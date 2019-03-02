package company.task03;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Service service = new Service();

        //1.Ввести с консоли n целых чисел. На консоль вывести:
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = scanner.nextInt();
        }
        service.findMaxMinLenghtValue(sourceNumbers);
        service.sortByMaxMinLenghtOfElement(sourceNumbers);
        service.printLengthOfElement(sourceNumbers);
        service.findFirstNumberWithMinSameChars(sourceNumbers);
        service.findValueIncreasedOneByOne(sourceNumbers);
        service.findValueContainWithDifferentDigits(sourceNumbers);
        service.findNumberPalindrome(sourceNumbers);
    }
}

