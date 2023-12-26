public class Job extends JobPosition {
    int jobID;
    String jobAddress;

    public Job(int jobID, String jobAddress, int jobPositionID, String jobPositionName) {
        super(jobPositionID, jobPositionName);
        this.jobID = jobID;
        this.jobAddress = jobAddress;
    }
}
