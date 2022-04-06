package ArraysBsp;

public class ArraySum {
    public static void main(String args[]){
//kreiranje dve matrice
        int a[][]={{1,3,4},{3,4,5}};
        int b[][]={{1,3,4},{3,4,5}};

//kreiranje druge matrice u koju se sprema suma dve matrice
        int c[][]=new int[2][3];

//sabiranje i ispis zbira 2 matrice
        for(int i=0; i < 2;i++){
            for(int j=0; j < 3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(); //novi red
        }
    }
}

