import java.util.Scanner;

public class SecondPart {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите свой возраст: ");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");}
        else {
            System.out.println("Вы ешё не совершеннолетний, вам нужно немного подождать");}

        // Задача 2

        System.out.println("Задача 2");
        Scanner inn = new Scanner(System.in);
        System.out.print("Укажите свой возраст: ");
        int years = in.nextInt();
        if (years < 7) {
            System.out.println("Вы ходите в детский садик Солнышко");}
        else if (years >= 7 && years < 18) {
            System.out.println("Ребёнок ходит в школу");}
        else if (years >= 18 && years < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");}
        else { System.out.println("Вам пора найти работу");}

        // Задача 3
        System.out.println("Задача 3");
        Scanner people = new Scanner(System.in);
        System.out.print("Введите вашу позицию в очереди: ");
        int passengers = in.nextInt();
        if (passengers <= 60) {
            System.out.println("Вам достанется сидячее место");}
        else if (passengers > 60 && passengers <=102) {
        System.out.println("Сидячие места закончились, вы поедете стоя");}
        else {System.out.println("К сожалению, мест нет. Дождитесь другого поезда");}
    }
}
