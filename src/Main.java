import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите свой возраст: ");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18 ) {
            System.out.println("Возраст совершеннолетия ещё не наступил, Вам нужно немного подождать)");
        }

        // Задача 2
        System.out.println("Задача 2");
        Scanner inn = new Scanner(System.in);
        System.out.print("Укажите свой возраст: ");
        int years = in.nextInt();
        if (years >= 7 && years < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (years >= 18 && years < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (years >= 24 ) {
            System.out.println("Вам пора искать работу");
        }
        if (years < 7 ) {
            System.out.println("Вы ходите в детский садик Солнышко");
        }


        // Задача 3
        System.out.println("Задача 3");
        Scanner line = new Scanner(System.in);
        System.out.print("Укажите вашу позицию в очереди: ");
        int passenger = in.nextInt();
        if (passenger > 0 && passenger <= 60) {
            System.out.println("Вам повезло, Вы займете сидячее место");
        }
        if (passenger > 60 && passenger <= 102) {
            System.out.println("Вам повезло, но немножко: Вы поедете стоя");
        }
        if (passenger > 102 ) {
            System.out.println("Мест нет. Ждите следующий поезд");
        }

    }
}