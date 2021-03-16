package com.company;

public class Main {

    

    public static void main(String[] args) {
	// write your code here
        class TwoToOne {

            public String longest(String s1, String s2) {
                // your code
                StringBuilder c = new StringBuilder();
                c.append(s1).append(s2);
                int n = c.length();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if ((int) c.charAt(i) == (int) c.charAt(j)) {
                            c.deleteCharAt(j);
                        }
                    }
                }
                String result = c.toString();
                char[] arr = result.toCharArray();
                int N = arr.length;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if ((int) arr[i] > (int) arr[j]) {
                            char temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                        }
                    }
                }
                String res = new String(arr);
                return res;
            }
        }
    }
}
