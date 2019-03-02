package company.task03;

import java.util.Arrays;

public class Service {

    public void findMaxMinLenghtValue(int[] numbers) {

        int[] lengthOfElem = getArrayLengthOfElement(numbers);
        arraySort(numbers);
        arraySort(lengthOfElem);
        System.out.println("max value = " + numbers[numbers.length - 1] + " num of chars " + lengthOfElem[lengthOfElem.length - 1]);
        System.out.println("min value = " + numbers[0] + " num of chars " + lengthOfElem[0]);
    }

    public void sortByMaxMinLenghtOfElement(int[] elements) {

        int[] lengthOfElem = getArrayLengthOfElement(elements);

        arraySort(elements);
        arraySort(lengthOfElem);

        System.out.println("Min -> max");

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Value " + elements[i] + " - > Number of Chars " + lengthOfElem[i]);
        }
        System.out.println("");
        System.out.println("Max -> min");

        for (int i = elements.length - 1; i > 0; i--) {
            System.out.println("Value " + elements[i] + " - > Number of Chars " + lengthOfElem[i]);
        }
    }

    public void printLengthOfElement(int[] elements) {

        int[] lengthOfElem = getArrayLengthOfElement(elements);

        int sumLenghtOfElem = 0;
        int elementsCount = 0;

        for (int i = 0; i < lengthOfElem.length; i++) // calculate avarage number of chars
        {
            sumLenghtOfElem += lengthOfElem[i];
            elementsCount++;
        }
        double avarageLengthOfElem = (double) sumLenghtOfElem / (double) elementsCount;

        System.out.println("Values less then avarage");
        for (int i = 0; i < lengthOfElem.length; i++) {
            if (lengthOfElem[i] < avarageLengthOfElem) {
                System.out.println("Value " + elements[i] + " - > Number of Chars " + lengthOfElem[i]);
            }
        }
        System.out.println("Values bigger then avarage");
        for (int i = 0; i < lengthOfElem.length; i++) {
            if (lengthOfElem[i] > avarageLengthOfElem) {
                System.out.println("Value " + elements[i] + " - > Number of Chars " + lengthOfElem[i]);
            }
        }
    }

    public void findFirstNumberWithMinSameChars(int[] elements) {

        int[] countArray = new int[elements.length];
        int maxValueOfDifferentDigitsIndex = 0;
        int maxValueOfDifferentDigits = 0;

        for (int i = 0; i < elements.length; i++) {

            int count = 0;
            int[] valueElements = getCharsOfInteger(elements[i]);
            for (int j = 0; j < valueElements.length; j++) {

                for (int k = j + 1; k < valueElements.length; k++) {
                    if (valueElements[j] == valueElements[k]) {
                        count++;
                    }
                }
            }
            countArray[i] = count;
        }

        for (int j = 0; j < countArray.length; j++)// find element with max value
        {

            if (countArray[j] > maxValueOfDifferentDigits) {
                maxValueOfDifferentDigitsIndex = j;
                maxValueOfDifferentDigits = countArray[j];
            }
        }
        System.out.println("Number with maximum similar values of numbers");

        System.out.println(elements[maxValueOfDifferentDigitsIndex]);

    }

    public void findValueIncreasedOneByOne(int[] elements) {

        for (int value : elements) {
            int[] valuesCharsArray = getCharsOfInteger(value);
            int[] templateArray = new int[valuesCharsArray.length];
            templateArray = Arrays.copyOfRange(valuesCharsArray, 0, valuesCharsArray.length);
            arraySort(templateArray);

            if (Arrays.equals(templateArray, valuesCharsArray)) {
                System.out.println(value);
                break;
            }
            ;

        }

    }

    public void findValueContainWithDifferentDigits(int[] elements) {

        for (int value : elements) {
            int[] valuesCharsArray = getCharsOfInteger(value);
            arraySort(valuesCharsArray); // if chars are sorted, so same digits will be located one by one
            Boolean sameDigits = true;

            for (int i = 0; i < valuesCharsArray.length - 1; i++) {

                if (valuesCharsArray[i] == valuesCharsArray[i + 1]) {
                    sameDigits = true;
                    break;
                } else sameDigits = false;

            }
            if (sameDigits == false) {
                System.out.println("Value with diff digits " + value);
                break;
            }
        }
    }

    public void findNumberPalindrome(int[] elements) {
        String palindromes = null;
        for (int i = 0; i < elements.length; i++) {

            String s1 = Integer.toString(elements[i]);
            if (s1.length() > 1 && isPalindrome(s1)) {
                palindromes += (s1 + " ");
            }
        }

        if (palindromes != null) {
            System.out.println("Numbers palindrome : " + palindromes);
        } else {
            System.out.println("Numbers palindromes couldn't find ");
        }
    }


    private void arraySort(int[] values) {
        int tmp = 0;
        for (int i = values.length; i > 0; i--) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    tmp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = tmp;
                }
            }

        }

    }

    // get massive of chars number for values
    private int[] getArrayLengthOfElement(int[] values) {
        int[] numOfChars = new int[values.length];
        int i = 0;
        for (int value : values) {
            numOfChars[i] = getCountsOfDigits(value);
            i++;
        }
        return numOfChars;
    }


    // Count number of char in Integer
    private int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }


    // Integer is divided into separate elements
    private int[] getCharsOfInteger(int number) {
        int[] elements = new int[getCountsOfDigits(number)];
        for (int i = 0; i < elements.length; i++) {

            elements[elements.length - i - 1] = number % 10;
            number /= 10;
        }
        return elements;

    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }
}
