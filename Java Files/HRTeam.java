import java.util.List;

public class HRTeam {

    public void informCandidates(List<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            if (candidate.isEligible()) {
                System.out.println(candidate.getName() + ", Congratulations! You have been selected.");
            } else {
                System.out.println(candidate.getName() + ", We regret to inform you that you are not selected.");
            }
        }
    }
}

