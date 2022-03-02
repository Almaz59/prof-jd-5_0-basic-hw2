package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1:
        byte varOne = 127;
        short varTwo = 32767;
        int varThree = 2147483647;
        long varFour = 9223372036854775807L;
        float varFive = 5.5555555f;
        double varSix = 5.5555555555555555;
        char varSeven = 'A';
        boolean varEight = true;
        boolean varNine = false;
        System.out.println(varOne + " | " + varTwo + " | " + varThree + " | " + varFour + " | " + varFive + " | " + varSix + " | " + varSeven + " | " + varEight + " | " + varNine);

        // Задача 2:

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        float diffWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес бойцов - " + totalWeight + " кг" + " | " + "Один боец тяжелее другого на - " + diffWeight + " кг");

        // Задача 3:
        int bananasQuantity = 5;
        int bananasWeightGram = 80;
        int milkQuantity = 2;
        int milkWeightGram = 105;
        int iceCreamQuantity = 2;
        int iceCreamWeightGram = 100;
        int eggsQuantity = 4;
        int eggsWeightGram = 70;
        int bananasTotalWeightGram = bananasQuantity * bananasWeightGram;
        int milkTotalWeightGram = milkQuantity * milkWeightGram;
        int iceCreamTotalWeightGram = iceCreamQuantity * iceCreamWeightGram;
        int eggsTotalWeightGram = eggsQuantity * eggsWeightGram;
        int cocktailTotalWeightGram = bananasTotalWeightGram + milkTotalWeightGram + iceCreamTotalWeightGram + eggsTotalWeightGram;
        int cocktailTotalWeightKilo = cocktailTotalWeightGram / 1000;

        System.out.println("Общий вес коктеля в граммах - " + cocktailTotalWeightGram + " | " + "Общий вес коктеля в киллограммах - " + cocktailTotalWeightKilo);

        // Задача 4:
        int targetWeightKilo = 7;
        int targetWeightGram = targetWeightKilo * 1000;
        int lose250Gram = targetWeightGram / 250;
        int lose500Gram = targetWeightGram / 500;
        int middleLoseWeightGram = (500 + 250) / 2;
        int loseMiddleWeightGram = targetWeightGram / middleLoseWeightGram;
        System.out.println("Дней на похудение при потере 250 гр. - " + lose250Gram + " | " + "Дней на похудение при потере 500 гр. - " + lose500Gram + " | " + "Среднее количество дней для похудения гр. - " + loseMiddleWeightGram);

        // Задача 5:
        int oldMashaSalary = 67760;
        int oldDenisSalary = 83690;
        int oldKristinaSalary = 76230;
        double newMashaSalary = 67760 * 0.1 + oldMashaSalary;
        double newDenisSalary = 83690 * 0.1 + oldDenisSalary;
        double newKristinaSalary = 76230 * 0.1 + oldKristinaSalary;
        int oldMashaSalaryFor12Months = oldMashaSalary * 12;
        int oldDenisSalaryFor12Months = oldDenisSalary * 12;
        int oldKristinaSalaryFor12Months = oldKristinaSalary * 12;
        double newMashaSalaryFor12Months = newMashaSalary * 12;
        double newDenisSalaryFor12Months = newDenisSalary * 12;
        double newKristinaSalaryFor12Months = newKristinaSalary * 12;
        double diffBetweenNewAndOldMashaSalary = newMashaSalaryFor12Months - oldMashaSalaryFor12Months;
        double diffBetweenNewAndOldDenisSalary = newDenisSalaryFor12Months - oldDenisSalaryFor12Months;
        double diffBetweenNewAndOldKristinaSalary = newKristinaSalaryFor12Months - oldKristinaSalaryFor12Months;
        System.out.println("Маша теперь получает - " + newMashaSalary + " рублей. Годовой доход вырос на " + diffBetweenNewAndOldMashaSalary + " рублей" + " | " + "Денис теперь получает - " + newDenisSalary + " рублей. Годовой доход вырос на " + diffBetweenNewAndOldDenisSalary + " рублей" + " | " + "Кристина теперь получает - " + newKristinaSalary + " рублей. Годовой доход вырос на " + diffBetweenNewAndOldKristinaSalary + " рублей");

    }
}
