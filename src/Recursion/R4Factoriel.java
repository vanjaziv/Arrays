package Recursion;

public class R4Factoriel {
    static int factorial(int n){
    if (n == 1)
        return 1;
    else
        return(n * factorial(n-1));
}

    public static void main(String[] args) {
        System.out.println("Faktorijel od 5 je: "+factorial(5));
    }
}

