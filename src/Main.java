public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        for(int i = 0; i <= 10; i = i + 1){
            System.out.println(i);}


        System.out.println("Задание 2");
        for(int i = 10; i>=0; i = i - 1) {
            System.out.println(i);}

        System.out.println("Задание 3");
        for(int i = 0; i < 17; i++)
            if (i % 2 == 0 && i != 0) {
        System.out.println(i);}

        System.out.println("Задание 4");
        for(int i = 10; i>=-10; i = i - 1) {
            System.out.println(i);}

        System.out.println("Задание 5");
        for(int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");}

        System.out.println("Задание 6");
        for(int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);}

        System.out.println("Задание 7");
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);}

        System.out.println("Задание 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}

        System.out.println("Задание 9");
        int deposit2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + deposit2;
            total2 = total2 + total2 / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей");}

        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }

    }
}