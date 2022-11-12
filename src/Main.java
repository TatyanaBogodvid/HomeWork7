public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        //Задание 1.1
       System.out.println("Задание 1.1");
        int fullAmount = 0;
        int monthlyAmount = 15000;
        int i = 0;
        while (fullAmount <= 2459000) {
            i++;
            fullAmount = fullAmount + fullAmount / 100;
            fullAmount = fullAmount + monthlyAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + fullAmount + " рублей.");
            }
        // Почему цикл продолжается после 2459000? Что я неправильно сделала?

        //Задание 2.1
        System.out.println("Задание 2.1");
        int x = 0;
        while (x < 10) {
            x ++;
            System.out.print (x + " ");
        }
        System.out.println ("");
        for (x = 10; x >= 1; x --) {
            System.out.print(x + " ");
        }

        // Задание 3.1
        System.out.println ("");
        System.out.println("Задание 3.1");
        int population = 12_000_000;
        int born = population / 1000 * 17;
        int dead = population / 1000 * 8;
        int year;
        for (year = 1; year <=10; year ++) {
            population = population + born - dead;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //Домашнее задание 2
        //Задание 1.2
        System.out.println("Задание 1.2");
        int deposit = 15000;
        int month;
        for (month = 1; deposit <= 12_000_000; month ++) {
            deposit = deposit + deposit / 100 * 7;
            System.out.println("Месяц " + month + ", сума накоплений " + deposit + " рублей.");
        }

        //Задание 2.2
        System.out.println("Задание 2.2");
        deposit = 15000;
        month = 1;
        while (deposit <= 12_000_000) {
            month++;
            deposit = deposit + deposit / 100 * 7;
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + ", сума накоплений " + deposit + " рублей.");}
        }

        //Задание 3
        System.out.println("Задание 3.2");
        deposit = 15000;
        month = 1;
        while (month <= 9 * 12) {
            month++;
            deposit = deposit + deposit / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сума накоплений " + deposit + " рублей.");}
        }

        //Задание 4
        System.out.println("Задание 4.2");
        int friday;
        for (friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
        }

        //Домашнее задание 3
        //Задание 1.3
        System.out.println("Задание 1.3");
        int thisYear = 2022;
        int lastYear = thisYear - 200;
        int nextYear = thisYear + 100;
        for (i = 0; i <= lastYear; i = i + 79){
           // System.out.println(i);
        }
        for (i = i; i >= lastYear && i <= nextYear; i = i + 79) {
            System.out.println(i);
        }

        //Задание 2.3
        System.out.println("Задание 2.3");
        for (i = 1; i <= 10; i ++){
            int res = i * 2;
            System.out.println("2 * " + i + " = " + res);
        }



    }
}