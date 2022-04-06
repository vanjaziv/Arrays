package ArraysBsp;

public class ArraySimple {
    public static void main(String args[]){

        int a[]=new int[5]; //deklaracija i instancijacija
        a[0]=10; //inicijalizacija
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;

//ispisivanje niza
        for(int i=0; i < a.length;i++)  //length (dužina) je osobina niza
            System.out.println(a[i]);
    }
}

