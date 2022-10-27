import java.util.Scanner;

public class ThirdPart {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите свой возраст: ");
        int age = in.nextInt();
        if (age < 7) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский садик");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
        }

        // Задача 2
        System.out.println("Задача 2");
        Scanner inn = new Scanner(System.in);
        System.out.print("Укажите свой возраст: ");
        int year = in.nextInt();
        if (year < 5) {
            System.out.println("Если возраст ребёнка равен " + year + " ,то ему нельзя кататься на аттракционе");
        } else if (year >= 5 && year < 14) {
            System.out.println("Если возраст ребёнка равен " + year + " ,то ему можно кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст человека равен " + year + " ,то ему он может кататься на аттракционе самостоятельно");
        }

        //Задача 3
        System.out.println("Задача 3");
        Scanner number = new Scanner(System.in);
        System.out.print("Укажите три любых числа через enter: ");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two > three && two > one) {
            System.out.println("Число " + two + " самое большое");
        } else {
            System.out.println("Число " + three + " самое большое");
        }
    }
}