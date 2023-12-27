import java.util.List;
import java.util.Scanner;

public class Utils {
    private int inputInt(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private String inputString(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.next();
    }

    public void addJob(List<Job> jobs, Scanner scanner) {
        int newJobID = inputInt("Enter job ID:", scanner);

        try {
            for (Job job : jobs) {
                if (job.jobID == newJobID) {
                    throw new Exception();
                }
            }
            jobs.add(new Job(
                    newJobID,
                    inputString("Enter job address:", scanner),
                    inputInt("Enter job position ID:", scanner),
                    inputString("Enter job position name:", scanner)
            ));
            System.out.println("Success add new job!");
        } catch (Exception e) {
            System.out.println("Job ID sudah ada!");
        }

    }

    public void printAllJobs(List<Job> jobs) {
        System.out.println("All Jobs:");
        jobs.forEach(job ->
                System.out.println("Job ID: " + job.jobID + ", Address: " + job.jobAddress + ", Job position ID: " + job.jobPositionID + ", Job position name: " + job.jobPositionName)
        );
    }

    public void deleteJob(List<Job> jobs, Scanner scanner) {
        int deleteJobID = inputInt("Enter job ID to delete:", scanner);
        boolean jobFound = false;

        for (Job job : jobs) {
            if (job.jobID == deleteJobID) {
                jobs.remove(job);
                System.out.println("Job deleted successfully!");
                jobFound = true;
                break;
            }
        }


        if (!jobFound) {
            System.out.println("Job not found!");
        }
    }
}
