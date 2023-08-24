public class Main {
    public static void main(String[] args) {

        byte variableByte = 50;
        short variableShort = 15000;
        int variableInteger = 1900501;
        long variableLong = 1905340999L;
        float variableFloat = 52.71F;
        double variableDouble = 25.65691;
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte);
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort);
        System.out.println("Значение переменной variableInteger с типом int равно " + variableInteger);
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong);
        System.out.println("Значение переменной variableFloat с типом float равно " + variableFloat);
        System.out.println("Значение переменной variableDouble с типом double равно " + variableDouble);

        float varFloat = 27.12F;
        long varLong = 987678965549L;
        double varDouble = 2.786;
        short varShortFirst = 569;
        short varShortSecond = -159;
        int varInteger = 27897;
        byte varByte = 67;

        byte firstClass = 23; // в первом классе 23 ученика
        byte secondClass = 27; // во втором классе 27 учеников
        byte thirdClass = 30; // в третьем классе 30 учеников
        short paper = 480; // общее количество листов бумаги 480
        short totalStudent = (short) (firstClass + secondClass + thirdClass); // количество учеников
        short paperOneStudent = (short) (paper / totalStudent); // количество бумаги на одного ученика
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");

        byte bottleMinute = 16 / 2; // производительность за минуту времени
        short bottleTwentyMinute = (short) (20 * bottleMinute); //производительность за 20 минут
        short bottleDay = (short) ((24 * 60) * bottleMinute); //производительность в сутки
        int bottleThreeDay = bottleDay * 3; //производительность за трое суток
        int bottleMonth = bottleDay * 31; //производительность за месяц, в августе 31 день)))
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleMonth + " штук бутылок");

        byte jarPaint = 120; // куплено 120 банок краски
        byte oneClass = (byte) (jarPaint / (2 + 4)); // количество классов
        byte whitePaint = (byte) (oneClass * 2); // колчество белой краски
        byte brownPaint = (byte) (oneClass * 4); // количество коричневой краски
        System.out.println("В школе, где " + oneClass + " классов, нужно " + whitePaint + " банок белой краски и " +
                brownPaint + " банок коричневой краски");

        byte bananas = 80;
        byte milk = 105; // количество грамм в 100 миллилитров
        byte iceCream = 100;
        byte egg = 70;
        byte SumBananas = 5;
        byte milkSum = 200 / 100;
        byte iceCreamSum = 2;
        byte eggSum = 4;
        short bananasWeight = (short) (bananas * SumBananas); // бананы в граммах для рецепта
        short milkWeight = (short) (milk * milkSum); // молоко в граммах для рецепта
        short iceCreamWeight = (short) (iceCream * iceCreamSum); // мороженое в граммах для рецепта
        short eggWeight = (short) (egg * eggSum); // яйца в граммах для рецепта
        short productWeight = (short) (bananasWeight + milkWeight + iceCreamWeight + eggWeight); //вес продуктов
        float productInKg = (float) (productWeight / 1000.0); // вес продуктов в килограммах
        System.out.println("Рецепт спортзавтрака: \n" + bananasWeight + " грамм бананов \n" +
                milkWeight + " грамм молока \n" + iceCreamWeight + " грамм мороженое-пломбир \n" + eggWeight +
                " грамм сырых яиц \n" + "Вес продуктов: " + productWeight + " грамм \n" +
                "Вес продуктов: " + productInKg + " кг");

        short resetWeight = 7;
        short slowWeight = 250;
        short fastWeight = 500;
        resetWeight = 7 * 1000; // сбросить вес в граммах
        short slowDayWeight = (short) (resetWeight / slowWeight); // сбросит вес при 250 грамм в день
        short fastDayWeight = (short) (resetWeight / fastWeight); // сбросит вес при 500 грамм в день
        short averageDayWeight = (short) ((slowDayWeight + fastDayWeight) / 2); // среднее количество дней
        System.out.println("Спортсмену необходимо сбросить " + resetWeight + " грамм веса \n" +
                "Если спортсмен будет терять каждый день 250 грамм, потребуется " + slowDayWeight + " дней \n" +
                "Если спортсмен будет терять каждый день 500 грамм, потребуется " + fastDayWeight + " дней \n" +
                "Среднее количество дней для похудения: " + averageDayWeight);

        int firstEmployee = 67760; // Маша получает 67 760 рублей в месяц
        int secondEmployee = 83690; // Денис получает 83 690 рублей в месяц
        int thirdEmployee = 76230; // Кристина получает 76 230 рублей в месяц
        float percent = (float) 10 / 100; // Проценты в десятичном значении
        float firstUpEmployee = (float) (firstEmployee * percent) + firstEmployee; // Маша + 10 %
        float secondUpEmployee = (float) (secondEmployee * percent) + secondEmployee; // Денис + 10 %
        float thirdUpEmployee = (float) (thirdEmployee * percent) + thirdEmployee; // Кристина + 10 %
        float firstYearEmployee = (firstUpEmployee - firstEmployee) * 12; // Годовая разница Маши
        float secondYearEmployee = (secondUpEmployee - secondEmployee) * 12; // Годовая разница Дениса
        float thirdYearEmployee = (thirdUpEmployee - thirdEmployee) * 12; // Годовая разница Кристины
        System.out.println("Маша теперь получает " + firstUpEmployee + " рублей. Годовой доход вырос на " +
                firstYearEmployee + " рублей");
        System.out.println("Денис теперь получает " + secondUpEmployee + " рублей. Годовой доход вырос на " +
                secondYearEmployee + " рублей");
        System.out.println("Кристина теперь получает " + thirdUpEmployee + " рублей. Годовой доход вырос на " +
                thirdYearEmployee + " рублей");
    }
}