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
        int totalStudent = firstClass + secondClass + thirdClass; // количество учеников
        int paperOneStudent = paper / totalStudent; // количество бумаги на одного ученика
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");
    }
}