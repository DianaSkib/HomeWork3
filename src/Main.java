//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte hamsters = 33;
        short busyHamsters = 235;
        int hamstersWeight = 75000;
        long giraffe = 3550000;

        float sleepGiraffe = 5.5384F;
        double sleepHamsters = 10.5466884689;

        System.out.println("Значение переменной hamsters" + " с типом byte" + " равно " + hamsters);
        System.out.println("Значение переменной busyHamsters" + " с типом short" + " равно " + busyHamsters);
        System.out.println("Значение переменной hamstersWeight" + " с типом int" + " равно " + hamstersWeight);
        System.out.println("Значение переменной giraffe" + " с типом long" + " равно " + giraffe);
        System.out.println("Значение переменной sleepGiraffe" + " с типом float" + " равно " + sleepGiraffe);
        System.out.println("Значение переменной sleepHamsters" + " с типом double" + " равно " + sleepHamsters);

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte studentClass = 3;
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekterinaAndreevna = 30;
        short paper = 480;

        int totalStudents = (ludmilaPavlovna + annaSergeevna + ekterinaAndreevna);
        int litstStudent = (paper / totalStudents);

        System.out.println("На каждого ученика расчитано " + litstStudent + " листов бумаги");

        byte efficiencyMachine = 16;
        byte time = 2;
        int bottleMinute = (efficiencyMachine / time); ///сколько сколько бутылок в минуту
           System.out.println(bottleMinute);
        short twentyMinute = 20;
        int bottleTwentym = (twentyMinute * bottleMinute);
           System.out.println("За 20 минут машина произвела " + bottleTwentym + " штук бутылок");

        byte oneHour = 60; ///сколько в одном часе минут
        int bottleHour = (bottleMinute * oneHour); /// сколько бутылок в час
        byte day = 24; /// сколько в сутках часов
        int bottleDay = (day * bottleHour);/// сколько бутылок в сутки
           System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");

        int threeDaysBottle = (bottleDay*3);
           System.out.println("За три дня машина произвела " + threeDaysBottle + " штук бутылок");

        byte oneMounth = 31;
        int bottleMounth = (bottleDay*oneMounth);
        System.out.println("За один месяц машина произвела " + bottleMounth + " штук бутылок");


        byte whitePot = 2;
        byte brownPot = 4;
        byte allPot = 120;
        int oneClass = (whitePot + brownPot);
        int allClass = (allPot / oneClass);
        int whitePaint = (allClass * whitePot);
        int brownPaint = (allClass * brownPot);

        System.out.println("В школе, где " + allClass +  " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        byte allBananas = 5;
        byte weightOneBananas = 80;
        short weightBananas = (short) (weightOneBananas * allBananas);
            System.out.println (weightBananas + " грамм бананов");

        short allMilk = 200;
        byte weightOneMilk = 105;
        int weightMilk = (weightOneMilk * 2);
            System.out.println (weightMilk + " грамм молока");

        byte iceCream = 2;
        byte oneBriquett = 100;
        short weightIcecream = (short) (iceCream * oneBriquett);
            System.out.println (weightIcecream + " грамм мороженного");


        byte rawEggs = 4;
        byte oneEggs = 70;
        short weightEggs = (short) (rawEggs * oneEggs);
            System.out.println (weightEggs + " грамм яиц");


        short breakfast = (short) (weightBananas + weightMilk + weightIcecream + weightEggs);
           System.out.println (breakfast + " грамм получился завтрак");

           float kg = 1000f;
           float breakfastKg = (breakfast / kg);
        System.out.println (breakfastKg + " кг.");


        byte extraKg = 7;
        float max = 0.250f;
        float min = 0.500f;

        byte minDay = (byte) (extraKg / max);
        System.out.println(minDay + " дней");

        byte maxDay = (byte) (extraKg / min);
        System.out.println (maxDay + " дней");

        float average = ((max + min) / 2);
        float dayAverage = (extraKg/average);
        System.out.println (dayAverage + " среднее количество дней");

    }
}