package ArraysBsp;

public class ArrayMaxNumber {
    static void max(int arr[]){
        int max=arr[0];
        for(int i=0; i < arr.length;i++)
            if(max<arr[i])
                max=arr[i];

        System.out.println(max);
    }

    public static void main(String args[]){

        int a[]={33,3,4,5};
        max(a);  //prosljeđivanje niza metodu
    }
}

