package Recursion;

public class R2Numbers {
    public static void main(String[] args) {

        herunterZahlen(5,12);
        System.out.println("****************");
        zahlen(10,5);
    }

    public static void herunterZahlen(int endZhal, int anfangZahl) {
        System.out.println(anfangZahl);
        anfangZahl--;
        if (anfangZahl >= endZhal) {
            herunterZahlen(endZhal, anfangZahl);
        }
    }

    public static void zahlen (int endZahl, int anfangZahl){
        System.out.println(anfangZahl);
        anfangZahl++;
        if (anfangZahl <= endZahl){
            zahlen(endZahl,anfangZahl);
        }
    }
}
