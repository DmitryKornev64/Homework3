public class Main {
    public static void main(String[] args) {

        // задача 1

                System.out.println("Задача 1. ");
        int cat = 2147483647;
        System.out.println("Значение переменной cat с типом int равно " + cat);
        byte ball = 127;
        System.out.println("Значение переменной ball с типом byte равно " + ball);
        short cubesWater = 32767;
        System.out.println("Значение переменной cubesWater с типом short равно " + cubesWater);
        long lovers = 922337203L;
        System.out.println("Значение переменной lovers с типом long равно " + lovers);
        float chairWeight = 45.78f;
        System.out.println("Значение переменной chairWeight с типом float равно " + chairWeight);
        double income = 0.236;
        System.out.println("Значение переменной income с типом double равно " + income);

        // задача 2

        System.out.println("Задача 2. ");
        double beefWeight = 27.12;
        System.out.println(beefWeight);
        long rubles = 987678965549L;
        System.out.println(rubles);
        float cocaineWeight = 2.786f;
        System.out.println(cocaineWeight);
        byte garagCeapacity = 67;
        System.out.println(garagCeapacity);
        boolean carsWillFit = garagCeapacity > 68;
        System.out.println(false);
        char cars = 569;
        System.out.println(cars);
        short temperature = -159;
        System.out.println(temperature);
        int areaResidents = 27897;
        System.out.println(areaResidents);

        // задача 3

        System.out.println("Задача 3.");
        byte atLyudmila = 23;
        byte atAnna = 27;
        byte atCatherine = 30;
        short sheetsOfPaper = 480;
        int totalStudents = atLyudmila + atAnna + atCatherine;
        long forEachStudent = sheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + forEachStudent + " листов бумаги.");

        // задача 4

        System.out.println("Задача 4.");
        byte twoMinutes = 16;
        byte PerMinute = 16 / 2;
        int inAnHour = PerMinute * 60;
        int inTwentyMinutes = PerMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + inTwentyMinutes + " штук.");
        int perDay = inAnHour * 24;
        System.out.println("За сутки машина произвела бутылок " + perDay + " штук.");
        int forThreeDays = perDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + forThreeDays + " штук.");
        int perMonth = perDay * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + perMonth + " штук.");

        // задача 5

        System.out.println("Задача 5.");
        byte totalCans = 120;
        byte OneClass = 2 + 4;
        int totalClasses = totalCans / OneClass;
        int whitePaint = totalClasses * 2;
        int brownPaint = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        // задача 6

        System.out.println("Задача 6.");
        byte oneBanana = 80;
        byte Milk100Ml = 105;
        byte oneIceCream = 100;
        byte oneEgg = 70;
        float grPerKg = 1000f;
        int dishWeight = oneBanana * 5 + Milk100Ml * 2 + oneIceCream * 2 + oneEgg * 4;
        System.out.println("Общая масса готового блюда равна " + dishWeight + " грамм.");
        float inKilograms = dishWeight / grPerKg;
        System.out.println("вес в килограммах равен " + inKilograms + " кг!");

        // задача 7

        System.out.println("Задача 7.");
        byte needToReset = 7;
        short duringTheDay1 = 250;
        short duringTheDay2 = 500;
        int needDays1 = needToReset * 1000 / duringTheDay1;
        int needDays2 = needToReset * 1000 / duringTheDay2;
        int daysOnAverage = needDays1 + needDays2 / 2;
        System.out.println("Дней уйдет " + needDays1 + " на похудение если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println("Дней уйдет " + needDays2 + " на похудение если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println("Дней уйдет в среднем " + daysOnAverage + " на похудение.");

        // задача 8

        System.out.println("Задача 8.");
        int mashaGets = 67760;
        int denisGets = 83690;
        int christinaGets = 76230;
        int salaryIncrease = 10;
        int afterPromotion1 = mashaGets / salaryIncrease + mashaGets;
        int incomeIncrease1 = afterPromotion1 - mashaGets;
        int afterPromotion2 = denisGets / salaryIncrease + denisGets;
        int incomeIncrease2 = afterPromotion2 - denisGets;
        int afterPromotion3 = christinaGets / salaryIncrease + christinaGets;
        int incomeIncrease3 = afterPromotion3 - christinaGets;
        System.out.println("Маша теперь получает " + afterPromotion1 + " рублей. Годовой доход вырос на " + incomeIncrease1 + " рублей.");
        System.out.println("Денис теперь получает " + afterPromotion2 + " рублей. Годовой доход вырос на " + incomeIncrease2 + " рублей.");
        System.out.println("Кристина теперь получает " + afterPromotion3 + " рублей. Годовой доход вырос на " + incomeIncrease3 + " рублей.");







    }
}