package Seminars.seminar_2.DZ;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        space();
    }

    public static void space() {
        System.out.print("Введите данные: ");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        if (!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Вы не ввели никаких данных");
        }
    }
}
