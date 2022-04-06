package ArraysBsp;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        float[][] array = new float[][]{{1, 2, 3, 4}, {3, 4, 5, 6}, {6, 7, 6, 3}, {1, 4, 5, 2}};
        System.out.println(Arrays.toString(mittelWerte(array)));

    }
    public static float[] mittelWerte(float[][] array){
        float[] mittelwertArray = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            float sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
            mittelwertArray[i] = sum / array[i].length;
        }
        return mittelwertArray;
    }
}

