package com.company;

import java.util.Scanner;

public class Main {

    static void t1() {
        System.out.println("Максимальное из введённых чисел\nВведите 5 целых чисел:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int max = 0;

        if (num1 > num2) max = num1;
        else max = num2;
        if (max > num3) ;
        else max = num3;
        if (max > num4) ;
        else max = num4;
        if (max > num5) ;
        else max = num5;

        System.out.println("Максимальное число: " + max);

    }

    static void t2() {
        System.out.println("Тест\nВведите номер правильного ответа.\n\nСколько будет 1+1:\n1. 3\n2. 5\n3. 2");
        Scanner sc = new Scanner(System.in);
        int answer1 = sc.nextInt();
        sc.nextLine();
        int trueAnswer1 = 3;
        double score = 0;
        if (answer1 == trueAnswer1) score += 1.2;

        System.out.println("Sam ... hard.\n1. studies\n2. study\n3. studys");
        int answer2 = sc.nextInt();
        sc.nextLine();
        int trueAnswer2 = 1;
        if (answer2 == trueAnswer2) score += 1.2;

        System.out.println("My father ... TV.\n1. watches\n2. watch \n3. watchs");
        int answer3 = sc.nextInt();
        sc.nextLine();
        int trueAnswer3 = 1;
        if (answer3 == trueAnswer3) score += 1.2;

        System.out.println("3*8.\n1. 12\n2. 24 \n3. 36");
        int answer4 = sc.nextInt();
        sc.nextLine();
        int trueAnswer4 = 2;
        if (answer4 == trueAnswer4) score += 1.2;

        System.out.println("8*5.\n1. 10\n2. 20 \n3. 40");
        int answer5 = sc.nextInt();
        sc.nextLine();
        int trueAnswer5 = 3;
        if (answer5 == trueAnswer5) score += 1.2;

        System.out.println("Сколько цветов у радуги.\n1. 9\n2. 7\n3. 11");
        int answer6 = sc.nextInt();
        sc.nextLine();
        int trueAnswer6 = 2;
        if (answer6 == trueAnswer6) score += 1.2;

        System.out.println("Помогает ли музыка быстрому росту растений.\n1. да\n2. нет\n3. иногда");
        int answer7 = sc.nextInt();
        sc.nextLine();
        int trueAnswer7 = 2;
        if (answer7 == trueAnswer7) score += 1.2;

        System.out.println("Сколько золота в золотой олимпийской медали.\n1. 6\n2. 16\n3. 220");
        int answer8 = sc.nextInt();
        sc.nextLine();
        int trueAnswer8 = 1;
        if (answer8 == trueAnswer8) score += 1.2;

        System.out.println("Укажите строку, где все слова являются синонимами.\n1. бросать, кидать, швырять\n2. ураган, дождь, пурга\n3. алфавит, азбука, букварь");
        int answer9 = sc.nextInt();
        sc.nextLine();
        int trueAnswer9 = 1;
        if (answer9 == trueAnswer9) score += 1.2;

        System.out.println("Новые слова, возникающие в языке, называются.\n1. историзмы\n2. неологизмы\n3. диалектизмы");
        int answer10 = sc.nextInt();
        sc.nextLine();
        int trueAnswer10 = 2;
        if (answer10 == trueAnswer10) score += 1.2;

        System.out.println("Ваша оценка: " + Math.round(score));
    }

    static void t3() {
        System.out.println("Проверка даты\nВведите дату в формате: день месяц год");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int monthDaysMax = 30;

        boolean yearHigh = false;
        boolean dataCorrect = false;
        boolean dayDiapasoon = false;
        boolean monthDiapasoon = false;

        if (year % 4 == 0) yearHigh = true;
        if (year % 100 == 0) yearHigh = false;
        if (year % 400 == 0) yearHigh = true;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            monthDaysMax = 31;

        if (month == 2 && yearHigh == true) monthDaysMax = 29;
        if (month == 2 && yearHigh == false) monthDaysMax = 28;

        if (day >= 1 && day <= monthDaysMax) dayDiapasoon = true;
        if (month >= 1 && month <= 12) monthDiapasoon = true;
        if (dayDiapasoon & monthDiapasoon == true) dataCorrect = true;

        System.out.println(dataCorrect);
    }


    static void t4() {
        System.out.println("Линейное уравнение вида ax+b=0.\nВведите коэффициент а:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите коэффициент b:");
        double b = sc.nextDouble();
        double x = -b / a;

        if (a == 0 && b != 0) System.out.println("Линейное уравнение не имеет корней.");
        if (a == 0 && b == 0) System.out.println("Линейное уравнение имеет бесконечно много корней.");
        if (a != 0) System.out.println("x = " + x);

    }

    static void t5() {
        System.out.println("Квадратное уравнение вида ax^2+bx+c=0.\nВведите коэффициент а:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите коэффициент b:");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите коэффициент c:");
        double c = sc.nextDouble();
        double D = b * b - 4 * a * c;

        if (D < 0) System.out.println("Уравнение имеет 2 мнимых корня (т.е. вещественных корней нет).");

        if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет 1 корень (или же 2 совпадающих вещественных корня)\n+" +
                    "x= " + x);
        }

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1 + ", x2= " + x2);
        }

    }


    static void addt1() {
        System.out.println("Самолёт и топливо\nВведите обьём бака (л)");
        Scanner sc = new Scanner(System.in);
        int tankCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите исходное количество топлива (л)");
        int fuelStart = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите вес груза (кг)");
        int cargoWeight = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите расстояние AC (км)");
        int AC = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите расстояние CB (км)");
        int CB = sc.nextInt();
        int AB = AC + CB;

        if (cargoWeight < 0) System.out.println("Вес введён некорентно");

        if (cargoWeight >= 0 && cargoWeight < 1000) {
            double fuelConsumption = 4; //100km/25l --> 1l = 4km
            double flyableStartDistance = fuelStart * fuelConsumption;


            if (flyableStartDistance >= AB) System.out.println("Самолёт долетит без дозаправки");

            if (flyableStartDistance < AC) System.out.println("Самолёт не долетит до пункта дозаправки");

            if (flyableStartDistance >= AC && flyableStartDistance < AB) { //дозаправка = CB/fuelconsumtion-остаток. потратил = AC/fuelconsumtion. остаток = fuelStart-потратил
                double fuelWasted = AC / fuelConsumption;
                double fuelLeft = fuelStart - fuelWasted;
                double refueling = CB / fuelConsumption - fuelLeft;
                double fuelToCB = refueling + fuelLeft;

                if (fuelToCB > tankCapacity) System.out.println("Недостаточная вместимость бака для дозаправки");

                if (fuelToCB <= tankCapacity) System.out.println("Необходимо дозаправить: " + refueling + " л");


            }


        }

        if (cargoWeight >= 1000 && cargoWeight < 2000) {
            double fuelConsumption = 30 / 100;
            double flyableStartDistance = fuelStart * fuelConsumption;

            if (flyableStartDistance >= AB) System.out.println("Самолёт долетит без дозаправки");

            if (flyableStartDistance < AC) System.out.println("Самолёт не долетит до пункта дозаправки");

            if (flyableStartDistance >= AC && flyableStartDistance < AB) {
                double fuelWasted = AC / fuelConsumption;
                double fuelLeft = fuelStart - fuelWasted;
                double refueling = CB / fuelConsumption - fuelLeft;
                double fuelToCB = refueling + fuelLeft;

                if (fuelToCB > tankCapacity) System.out.println("Недостаточная вместимость бака для дозаправки");

                if (fuelToCB <= tankCapacity) System.out.println("Необходимо дозаправить: " + refueling + " л");

            }


        }

        if (cargoWeight >= 2000 && cargoWeight < 3000) {
            double fuelConsumption = 35 / 100; //100km/25l --> 1l = 4km
            double flyableStartDistance = fuelStart * fuelConsumption;

            if (flyableStartDistance >= AB) System.out.println("Самолёт долетит без дозаправки");

            if (flyableStartDistance < AC) System.out.println("Самолёт не долетит до пункта дозаправки");

            if (flyableStartDistance >= AC && flyableStartDistance < AB) {
                double fuelWasted = AC / fuelConsumption;
                double fuelLeft = fuelStart - fuelWasted;
                double refueling = CB / fuelConsumption - fuelLeft;
                double fuelToCB = refueling + fuelLeft;

                if (fuelToCB > tankCapacity) System.out.println("Недостаточная вместимость бака для дозаправки");

                if (fuelToCB <= tankCapacity) System.out.println("Необходимо дозаправить: " + refueling + " л");

            }


        }

        if (cargoWeight >= 3000 && cargoWeight < 4000) {
            double fuelConsumption = 42 / 100;
            double flyableStartDistance = fuelStart * fuelConsumption;

            if (flyableStartDistance >= AB) System.out.println("Самолёт долетит без дозаправки");

            if (flyableStartDistance < AC) System.out.println("Самолёт не долетит до пункта дозаправки");

            if (flyableStartDistance >= AC && flyableStartDistance < AB) {
                double fuelWasted = AC / fuelConsumption;
                double fuelLeft = fuelStart - fuelWasted;
                double refueling = CB / fuelConsumption - fuelLeft;
                double fuelToCB = refueling + fuelLeft;

                if (fuelToCB > tankCapacity) System.out.println("Недостаточная вместимость бака для дозаправки");

                if (fuelToCB <= tankCapacity) System.out.println("Необходимо дозаправить: " + refueling + " л");

            }


        }

        if (cargoWeight >= 4000 && cargoWeight < 5000) {
            double fuelConsumption = 0.5;
            double flyableStartDistance = fuelStart * fuelConsumption;

            if (flyableStartDistance >= AB) System.out.println("Самолёт долетит без дозаправки");

            if (flyableStartDistance < AC) System.out.println("Самолёт не долетит до пункта дозаправки");

            if (flyableStartDistance >= AC && flyableStartDistance < AB) {
                double fuelWasted = AC / fuelConsumption;
                double fuelLeft = fuelStart - fuelWasted;
                double refueling = CB / fuelConsumption - fuelLeft;
                double fuelToCB = refueling + fuelLeft;

                if (fuelToCB > tankCapacity) System.out.println("Недостаточная вместимость бака для дозаправки");

                if (fuelToCB <= tankCapacity) System.out.println("Необходимо дозаправить: " + refueling + " л");

            }


        }

        if (cargoWeight >= 5000) System.out.println("Самолёт не взлетит с таким грузом");
        if (fuelStart > tankCapacity) {
            System.out.println("Исходные данные введены не корректно");
        }

    }

    static void addt2() {
        System.out.println("Алгоритм приготовления тостов\nЕсть ли у вас тостер?\n1 - да\n2 - нет");
        Scanner sc = new Scanner(System.in);
        int answer1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Есть ли у вас хлеб?\n1 - да\n2 - нет");
        int answer2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Есть ли у вас варенье?\n1 - да\n2 - нет");
        int answer3 = sc.nextInt();
        sc.nextLine();

        if (answer1 == 1 && answer2 == 2 && answer3 == 2) {
            System.out.println("Есть ли деньги на хлеб?\n1 - да\n2 - нет");
            int answerBread = sc.nextInt();
            System.out.println("Есть ли деньги на варенье?\n1 - да\n2 - нет");
            int answerJam = sc.nextInt();

            if (answerBread == 1 && answerJam == 1)
                System.out.println("Ваш алгоритм\n1 - Купить хлеб\n2 - Купить варенье\n3 - Нарезать хлеб\n4 - Положить хлеб в тостер");

        }

        if (answer1 == 2) {
            System.out.println("Есть ли деньги на тостер?\n1 - да\n2 - нет");
            int answerToster = sc.nextInt();
            if (answerToster == 2) System.out.println("Тостов не будет"); //1 nado kupit toster
        }

        if (answer2 == 2) {
            System.out.println("Есть ли деньги на хлеб?\n1 - да\n2 - нет");
            int answerToster = sc.nextInt();
            if (answerToster == 2) System.out.println("Тостов не будет"); //1 nado kupit
        }

        if (answer3 == 2) {
            System.out.println("Есть ли деньги на варенье?\n1 - да\n2 - нет");
            int answerToster = sc.nextInt();
            if (answerToster == 2) System.out.println("Тосты будут без варенья"); //1 nado kupit
        }

    }

    static void addt3() {
        System.out.println("Жалюзи\nВведите ширину (см)");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите высоту (см)");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Выберите материал:\n1.Пластик  200 грн/кв.м\n2.Текстиль 250 грн/кв.м\n3.Алюминий 350 грн/кв.м");
        int material = sc.nextInt();

        double square = width * height / 10000;
        double cost;

        int costPlastic = 200;
        int costTekstill = 250;
        int costAlum = 350;

        System.out.println("Ширина (см) –> " + width + "\nВысота (см) –> " + height + "\n\nМатериал:\n1.Пластик\n2.Текстиль\n3.Алюминий\nВаш выбор -> " + material);

        switch (material) {
            case 1 -> {
                cost = square * costPlastic;
                System.out.println("\nЦена за кв. м: " + costPlastic + "грн." + "\nПлощадь: " + square + " кв. м." + "\nК оплате: " + cost + " грн");
            }
            case 2 -> {
                cost = square * costTekstill;
                System.out.println("\nЦена за кв. м: " + costTekstill + "грн." + "\nПлощадь: " + square + " кв. м." + "\nК оплате: " + cost + " грн");
            }
            case 3 -> {
                cost = square * costAlum;
                System.out.println("\nЦена за кв. м: " + costAlum + "грн." + "\nПлощадь: " + square + " кв. м." + "\nК оплате: " + cost + " грн");
            }
            default -> System.out.println("\nERROR");
        }

    }

    static void addt4() {
        System.out.println("Программист Вася" +
                "\n1.Посчитать необходимое кол-во строк, зная желаемый доход и кол-во опоздания" +
                "\n2.Посчитать сколько раз можно опоздать, зная желаемый доход и кол-во строк" +
                "" +
                "\n3.Посчитать доход, зная кол-во строк кода и опозданий.");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        sc.nextLine();

        switch (answer) {
            case 1 -> {
                System.out.println("Введите желаемый доход");
                double income = sc.nextDouble();
                sc.nextLine();
                System.out.println("Введите кол-во опозданий");
                int late = sc.nextInt();
                int penalty = late / 3;
                double penaltyCost = penalty * 20;

                int lines = (int) ((income + penaltyCost) * 2);
                System.out.println("Необходимо " + lines + " строк кода.");
            }

            case 2 -> {
                System.out.println("Введите желаемый доход");
                double income = sc.nextDouble();
                sc.nextLine();
                System.out.println("Введите кол-во строк");
                int lines = sc.nextInt();

                double earned = lines / 2;
                double lateMoney = earned - income;
                int late = (int) (lateMoney / 10 * 3);

                if (lateMoney > 0) System.out.println("Можно опоздать " + late + " раз");
                else System.out.println("Опаздываать нельзя");
            }

            case 3 -> {
                System.out.println("Введите кол-во строк");
                int lines = sc.nextInt();
                sc.nextLine();
                System.out.println("Введите кол-во опозданий");
                int late = sc.nextInt();

                double earned = lines / 2;
                int penalty = late / 3;
                double penaltyCost = penalty * 20;
                double income = earned - penaltyCost;

                System.out.println("Ваш доход: " + income + "$");
            }
            default -> System.out.println("ERROR");
        }


    }

    public static void main(String[] args) {
        addt4();
    }
}
