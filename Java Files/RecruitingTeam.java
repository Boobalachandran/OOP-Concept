import java.util.Date;

public class RecruitingTeam {

    public boolean checkDateOfBirth(Candidate candidate) {
        Date cutoffDate = new Date(1999, 6, 1);
        return candidate.getDateOfBirth().compareTo(cutoffDate) >= 0;
    }
    public boolean checkHscAggregate(Candidate candidate) {
        double aggregatePercentage = (candidate.getPhysicsMarks() + candidate.getChemistryMarks() + candidate.getMathematicsMarks()) / 3.0;
        return aggregatePercentage >= 60.0;
    }
    public boolean checkHscAverageForSCST(Candidate candidate) {
        if (candidate.isSCST()) {
            double averagePercentage = (candidate.getPhysicsMarks() + candidate.getChemistryMarks() + candidate.getMathematicsMarks()) / 3.0;
            return averagePercentage >= 50.0;
        }
        return true;
    }
    public boolean checkUGCGPA(Candidate candidate) {
        return candidate.getUndergraduateResult() >= 8.0;
    }
    public boolean checkPGCGPA(Candidate candidate) {
        return candidate.getPostgraduateResult() >= 8.0;
    }

    public boolean checkProjectCount(Candidate candidate) {
        return candidate.getProjects() >= 2;
    }

    public boolean checkFullTimeStudy(Candidate candidate) {
        return candidate.isFullTimeStudy();
    }

    public boolean checkInterviewScore(Candidate candidate) {
        return candidate.getInterviewMarks() >= 35.0;
    }

    public boolean checkCitizenship(Candidate candidate) {
        return candidate.isIndianCitizen();
    }

    public boolean checkEligibility(Candidate candidate) {
        boolean isEligible = checkDateOfBirth(candidate) &&
                checkHscAggregate(candidate) &&
                checkHscAverageForSCST(candidate)  &&
                checkUGCGPA(candidate) &&
                checkPGCGPA(candidate) &&
                checkProjectCount(candidate) &&
                checkFullTimeStudy(candidate) &&
                checkInterviewScore(candidate) &&
                checkCitizenship(candidate);

        candidate.setEligible(isEligible);
        return isEligible;
    }

    public void conductInterview(Candidate candidate) {

    }
}
