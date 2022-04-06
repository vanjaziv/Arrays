package Recursion;

public class R3Count {
        static int count=0;
        static void p(){
            count++;
            if(count<=5){
                System.out.println("hello "+count);
                p();
            }
        }
        public static void main(String[] args) {
            p();
        }
    }

