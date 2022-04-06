package ArraysBsp;

public class ArrayVisedimenzijalni {
    public static void main(String args[]){

//deklarisanje i inicijalizovanje 2D niza
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

//ispisivanje 2D niza
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
