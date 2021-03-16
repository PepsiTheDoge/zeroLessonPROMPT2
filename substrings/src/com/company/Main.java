package com.company;

public class Main {

    public static void main(String[] args) {
        //сделать счетчик гласных и переменнуюю max
        String s = "ultrarevolutionariees";
        char[] arr = s.toCharArray();
        int n = arr.length;
        int k = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                k++;
                if(k > max) {
                    max = k;
                }
            } else {
                k = 0;
            }
        }
        System.out.println(max);
    }
}
