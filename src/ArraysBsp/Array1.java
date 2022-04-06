package ArraysBsp;

public class Array1 {
        public static void main(String[] args) {
            int[] array = new int[]{2, 6, 4, 1};
            System.out.println(indexOfSmallest(array));

        }

        public static int indexOfSmallest(int[] array) {

            if (array.length == 0)
                return -1;

            int index = 0;
            int min = array[index];

            for (int i = 1; i < array.length; i++) {
                if (array[i] <= min) {
                    min = array[i];
                    index = i;
                }
            }
            return index;
        }
    }


