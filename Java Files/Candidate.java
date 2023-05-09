import java.util.Date;

public class Candidate {
    private final String name;
    private final Date dateOfBirth;
    private final double physicsMarks;
    private final double chemistryMarks;
    private final double mathematicsMarks;
    private double biologyMarks;
    private final boolean isSCST;
    private final double undergraduateResult;
    private final double postgraduateResult;
    private final int projects;
    private final boolean isFullTimeStudy;
    private final double interviewMarks;
    private final boolean isIndianCitizen;
    private boolean eligible;


    public Candidate(String name, Date dateOfBirth, double physicsMarks, double chemistryMarks,
                     double mathematicsMarks, boolean isSCST, double undergraduateResult,
                     double postgraduateResult, int projects, boolean isFullTimeStudy,
                     double interviewMarks , boolean isIndianCitizen
                      ) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathematicsMarks = mathematicsMarks;
        this.biologyMarks = biologyMarks;
        this.isSCST = isSCST;
        this.undergraduateResult = undergraduateResult;
        this.postgraduateResult = postgraduateResult;
        this.projects = projects;
        this.isFullTimeStudy=isFullTimeStudy;
        this.interviewMarks = interviewMarks;
        this.isIndianCitizen = isIndianCitizen;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public double getPhysicsMarks() {
        return physicsMarks;
    }

    public double getChemistryMarks() {
        return chemistryMarks;
    }

    public double getMathematicsMarks() {
        return mathematicsMarks;
    }

    public double getBiologyMarks() {
        return biologyMarks;
    }

    public boolean isSCST() {
        return isSCST;
    }
    public double getUndergraduateResult() {
        return undergraduateResult;
    }

    public double getPostgraduateResult() {
        return postgraduateResult;
    }
    public int getProjects() {
        return projects;
    }
    public boolean isFullTimeStudy() {
        return isFullTimeStudy;
    }
    public double getInterviewMarks() {
        return interviewMarks;
    }
    public boolean isIndianCitizen() {
        return isIndianCitizen;
    }
    public boolean isEligible() {
        return eligible;
    }
    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public void calculateFinalMarks() {
        double finalMarks = (undergraduateResult + postgraduateResult + interviewMarks) / 3.0;
        System.out.println("Final Marks for " + name + ": " + finalMarks);
    }
}
