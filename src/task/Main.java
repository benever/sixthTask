package task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String firstName = in.nextLine();

        System.out.println("Введите возраст первого пользователя");
        Integer firstAge = scanner.nextInt();

        User firstPerson = new User(firstName,firstAge);


        System.out.println("Введите имя второго пользователя");
        String secondName = in.nextLine();

        System.out.println("Введите возраст второго пользователя");
        Integer secondAge = scanner.nextInt();

        User secondPerson = new User(secondName,secondAge);

        if(firstPerson.getAge() < secondPerson.getAge()) System.out.println(firstPerson);
        else if(firstPerson.getAge() > secondPerson.getAge()) System.out.println(secondPerson);
        else System.out.println("У пользователей одинаковый возраст");
    }
}
