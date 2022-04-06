package com.company;

public class Array4 {
    public static void main(String[] args) {
        String [] looser1 = new String[]{"Maja", "Ana", "Marko", "Lena"};
        String [] looser2 = new String[]{"Marko", "Lana", "Vanja", "Lena"};
        String[] output = luckyLooser(looser1, looser2);
        for (int i = 0; i < output.length; i++) {
            System.out.println(i + output[i]);
        }
    }
    public static String[] luckyLooser (String[] looser1, String[]looser2){
        String[] returnLuckyLooser;
        int countWords = 0;

        for (int i = 0; i < looser1.length; i++) {
            for (int j = 0; j < looser2.length; j++) {
                if (looser1[i].equalsIgnoreCase(looser2[j])) {
                    countWords++;
                }
            }
        }

        returnLuckyLooser = new String[countWords];
        countWords = 0;

        for (int i = 0; i < looser1.length; i++) {
            for (int j = 0; j < looser2.length; j++) {
                if (looser1[i].equalsIgnoreCase(looser2[j])
                        && !looser1[i].equalsIgnoreCase(returnLuckyLooser[countWords])) {
                    returnLuckyLooser[countWords] = looser1[i];
                    countWords++;
                }
            }
        }

        return returnLuckyLooser;
    }
}
