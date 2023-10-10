package org.example.core;

import java.util.Arrays;

public class ArraysPlayground {
    public static void main(String[] args) {
        //https://inside.java/2023/05/01/sip076/
        int[] numbers = new int[] {1,2,3,4,5};
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        int[] copyOfSomeNumbers = Arrays.copyOf(numbers, numbers.length - 3);
        int[] copyOfNumbersWithPadding = Arrays.copyOf(numbers, numbers.length + 1);

        String text = """
            copyOfNumbers - is an example of a simple copy of an array.
                        
            copyOfSomeNumbers - is an example of copying only a portion of an array.
                        
            copyOfNumbersWithPadding - is an example of copying an array and adding padding. The padded values are the default value for the type; in the case of int, that is 0.
            """;
        int[] numbers2 = new int[] {1,2,3,4,5};
        int[] copyOfNumbers2 = Arrays.copyOfRange(numbers, 0, 3);

        System.out.println(Arrays.toString(numbers2));//1,2,3,4,5
        System.out.println(Arrays.toString(copyOfNumbers2));//1,2,3

        int[] numbers3 = new int[] { 1, 2, 3, 4, 5 };

        Arrays.asList(numbers3);
        Arrays.stream(numbers3);
        Arrays.spliterator(numbers3);
        Arrays.toString(numbers3);

        int[] numbers4 = new int[] {1,2,3,4,5};
        int[] copyOfNumbers4 = Arrays.copyOf(numbers4, 5);

        System.out.println(numbers4.equals(copyOfNumbers4));//False
        System.out.println(Arrays.equals(numbers4, copyOfNumbers4));//True

        int[] numbers5 = new int[] {1,2,3,4,5};
        int[] copyOfNumbers5 = Arrays.copyOfRange(numbers5, 0, 3);

        System.out.println(Arrays.toString(numbers5));//1,2,3,4,5
        System.out.println(Arrays.toString(copyOfNumbers5));//1,2,3

        int[] numbers6 = new int[] { 1, 2, 3, 4, 5 };
        int[] moreNumbers6 = new int[] { 1, 2, 3, 6, 7 };

        System.out.println(numbers6.equals(moreNumbers6));// False
        System.out.println(Arrays.equals(numbers6, moreNumbers6));// False
        System.out.println(Arrays.equals(numbers6, 0, 2, moreNumbers6, 0, 2));// True

        int[][] coordinates = new int[][] { {10,20}, {100,200} };
        int[][] altCoordinates = new int[][] { {10,20}, {100,200} };

        System.out.println(coordinates.equals(altCoordinates));//False
        System.out.println(Arrays.equals(coordinates, altCoordinates));//False
        System.out.println(Arrays.deepEquals(coordinates, altCoordinates));//True

        int[] littleNumbers = new int[] {10, 20};
        int[] copyOfLittleNumbers = Arrays.copyOf(littleNumbers, 2);
        int[] bigNumbers = new int[] {100, 200};

        System.out.println(Arrays.compare(littleNumbers, bigNumbers));//-1
        System.out.println(Arrays.compare(bigNumbers, littleNumbers));//1
        System.out.println(Arrays.compare(littleNumbers, copyOfLittleNumbers));//0

        int[] numbers7 = new int[] { 3, 5, 2, 1, 4 };
        int[] moreNumbers7 = new int[] { 3, 5, 2, 1, 4 };

        System.out.println(Arrays.toString(numbers7));// 3,5,2,1,4
        Arrays.sort(numbers7);
        System.out.println(Arrays.toString(numbers7));// 1,2,3,4,5

        System.out.println(Arrays.toString(moreNumbers7));// 3,5,2,1,4
        Arrays.sort(moreNumbers7, 0, 3);
        System.out.println(Arrays.toString(moreNumbers7));// 2,3,5,1,4

        int[] numbers8 = new int[] { 1, 2, 3, 4, 5};

        System.out.println(Arrays.binarySearch(numbers8, 4)); // 3 - insertion point in array
        System.out.println(Arrays.binarySearch(numbers8, -0));// -1 - low value not in array
        // (one less than 0)
        System.out.println(Arrays.binarySearch(numbers8, 8)); // -6 - high value not in array
        // (negative value of length + 1)
    }
}
