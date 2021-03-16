package com.company;

public class Main {

    public static final String GREETING = "Hello world";

    public static void main(String[] args) throws Exception {
        System.out.println(GREETING);

        Car first = new Car(56, "Roar");
        System.out.println(first);
        throw new Exception("blablabla");
    }

    public static int movie(int card, int tiiicket, double perc) {
        double prevTicket = tiiicket;
        int aSum = 0;
        double bSum = 0;
        int result = 0;
        for (int i = 1; aSum > bSum + card; i++) {
            bSum += prevTicket * 0.9;
            aSum += tiiicket;
            prevTicket *= 0.9;
            result = i;
        }
        System.out.println(result);
        return result;
    }

}
