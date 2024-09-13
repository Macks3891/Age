import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner agePerson = new Scanner(System.in);
        System.out.println("Введите возраст человека:");

        int age = agePerson.nextInt();
        String message = "";

        if (age >= 2 && age <= 6) {
            message = "Если возраст человека равен " + age + ", то ему нужно идти в детский сад.";
        } else if (age >= 7 && age <= 18) {
            message = "Если возраст человека равен " + age + ", то ему нужно идти в школу.";
        } else if (age > 18 && age < 24) {
            message = "Если возраст человека равен " + age + ", то ему нужно учиться в универе.";
        } else if (age >= 24) {
            message = "Если возраст человека равен " + age + ", то ему пора на работу.";
        } else {
            message = "Некорректный возраст.";
        }

        System.out.println(message);

        agePerson.close();
    }
}