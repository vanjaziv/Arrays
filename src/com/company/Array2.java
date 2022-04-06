package com.company;

public class Array2 {
        public static void main(String[] args) {

            int[][] array = new int[][]{{1, 2, 3, 6}, {5, 6, 7, 8}, {9, 1, 2, 3}, {4, 5, 6, 7}};
            int sum = sumDiagonal(array);
            System.out.println("Sum of diagonal elements = " + sum);


        }

        public static int sumDiagonal(int[][] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][array[i].length - 1 - i];
            }
            return sum;
        }
    }
