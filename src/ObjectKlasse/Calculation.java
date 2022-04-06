package ObjectKlasse;

public class Calculation {

        void fact(int  n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("faktorijel je "+fact);
        }

        public static void main(String args[]){
            new Calculation().fact(5); //pozivanje metoda sa anonimnim objektom
        }
    }

