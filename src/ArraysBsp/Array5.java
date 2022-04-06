package ArraysBsp;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[][] smartphone = new int[][]{{1, 110}, {2, 40}, {1, 30}, {2, 5}, {3, 60}};
        print(SmartphoneSales(smartphone));

    }
    public static int[][] SmartphoneSales ( int[][] sales){
        int[][] sum = new int[sales.length][2];
        for (int z = 0; z < sales.length; z++) {
            sum[sales[z][0] - 1][0] = sales[z][0];
            sum[sales[z][0] - 1][1] += sales[z][1];
        }
        return sum;
    }

    public static void print(int[][] sums) {
        for (int i = 0; i < sums.length; i++) {
            System.out.println(Arrays.toString(sums[i]));
        }
    }

}
