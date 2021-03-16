package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(evaporator(10, 10, 10));
    }

    public static int evaporator(double content, double evap_per_day, double threshold) {
        // your code
        double mlPerDay = content/100.00 * evap_per_day;
        double mlThreshold = content/100.00 * threshold;
        int days = 0;
        for (int i = 0; content >= mlThreshold; i++) {
            days++;
            content -= mlPerDay;
            System.out.println(content);
            System.out.println(days);
        }
        return days;
    }
}
