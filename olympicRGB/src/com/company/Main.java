package com.company;

public class Main {

 /*   public static char triangle(final String row) {
        // Return the answer
        String row2 = row;
        char[] fRow = row2.toCharArray();
        int N = fRow.length;
        char[] sRow = new char[N-1];

        do {
            for (int i = 0; i < N - 1; i++) {
                char fColor = fRow[i];
                char sColor = fRow[i+1];
                if (fColor == 'R' && sColor == 'G' || fColor == 'G' && sColor == 'R') {
                    sRow[i] = 'B';
                } else if (fColor == 'R' && sColor == 'B' || fColor == 'B' && sColor == 'R') {
                    sRow[i] = 'G';
                } else if (fColor == 'G' && sColor == 'B' || fColor == 'B' && sColor == 'G') {
                    sRow[i] = 'R';
                } else {
                    sRow[i] = fRow[i];
                }
            }
            String rowMid = new String(sRow);
            row2 = rowMid;
            System.out.println(N);
        } while (N - 1 != 1);
        char[] array = row2.toCharArray();
        char res = array[0];
        return res;
    }
*/
        public static char triangle(final String row) {
            char[] newRow = row.toCharArray();
           for (int n = newRow.length; n > 1; n--) {
               for (int i = 0; i < n - 1; i++) {
                   char fColor = newRow[i];
                   char sColor = newRow[i + 1];
                   if (fColor == 'R' && sColor == 'G' || fColor == 'G' && sColor == 'R') {
                       newRow[i] = 'B';
                   } else if (fColor == 'R' && sColor == 'B' || fColor == 'B' && sColor == 'R') {
                       newRow[i] = 'G';
                   } else if (fColor == 'G' && sColor == 'B' || fColor == 'B' && sColor == 'G') {
                       newRow[i] = 'R';
                   } else {
                       fColor = fColor;
                   }
               }
           }
            return newRow[0];
        }
    public static void main(String[] args) {
            System.out.println(triangle("RBRGBRB"));
    }
}
