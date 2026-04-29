import java.util.Scanner;

public class TrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total data plan (in MB): ");
        double total = scanner.nextDouble();

        DataPlan plan = new DataPlan(total);

        int choice;

        do {
            System.out.println("\n--- Data Usage Tracker ---");
            System.out.println("1. Use Data");
            System.out.println("2. Check Status");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data used (MB): ");
                    double used = scanner.nextDouble();
                    plan.useData(used);
                    break;

                case 2:
                    plan.displayStatus();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        scanner.close();
    }
}
