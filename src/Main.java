import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==============DIGIJOBS==============");
            System.out.println("Please choose the following command:");
            System.out.println("1. Add new job");
            System.out.println("2. Print all jobs");
            System.out.println("3. Delete job");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Utils.addJob(jobs, scanner);
                    break;

                case 2:
                    Utils.printAllJobs(jobs);
                    break;

                case 3:
                    Utils.deleteJob(jobs, scanner);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid command.");
                    break;
            }
        }
    }
}
