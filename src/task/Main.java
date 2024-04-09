package task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intScan = new Scanner(System.in);
        Scanner strScan = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String firstName = strScan.nextLine();

        System.out.println("Введите возраст первого пользователя");
        Integer firstAge = intScan.nextInt();

        User firstPerson = new User(firstName,firstAge);


        System.out.println("Введите имя второго пользователя");
        String secondName = strScan.nextLine();

        System.out.println("Введите возраст второго пользователя");
        Integer secondAge = intScan.nextInt();

        User secondPerson = new User(secondName,secondAge);

        if(firstPerson.getAge() < secondPerson.getAge()) System.out.println(firstPerson);
        else if(firstPerson.getAge() > secondPerson.getAge()) System.out.println(secondPerson);
        else System.out.println("У пользователей одинаковый возраст");
    }
}
