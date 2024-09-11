import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner agePerson = new Scanner(System.in);
        String message = "Введите возраст человека.";
        System.out.println(message);

        int age = agePerson.nextInt();

        if (age >= 2 && age <= 6) {
            message = "Иди в детский сад.";
        } else if (age >= 7 && age <= 18) {
            message = "Иди в школу.";
        } else if (age > 18 && age < 24) {
            message = "Уже следует учиться в универе.";
        } else if (age >= 24) {
            message = "Пора на работу.";
        } else {
            message = "Некорректный возраст.";
        }

        System.out.println(message);

        agePerson.close();
    }
}