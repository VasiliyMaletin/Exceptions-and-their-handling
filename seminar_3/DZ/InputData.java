import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку в которой содержится ФИО, Дата рождения, Номер телефона и Пол. Пример: Pupkin Petr Nikolaevich 13.04.1997 89043212345 f:");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }
    }
}
