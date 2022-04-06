package Recursion;

public class R1Walking {
    public static void main(String[] args) {
        walk(10,0);

    }
    public static void walk(int countSteps, int currentStep){
        if ( countSteps > currentStep) {
            System.out.println("Step forward: " + (currentStep + 1));
            walk(countSteps, ++currentStep);
        }
        if ( countSteps > currentStep){
            System.out.println("Step backward: " + currentStep);

        }
    }
}
