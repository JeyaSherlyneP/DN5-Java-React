import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose notification type (EMAIL/SMS): ");

        String type = scanner.nextLine();

        try {

            Notification notification =
                    NotificationFactory.createNotification(type);

            notification.notifyUser();

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}