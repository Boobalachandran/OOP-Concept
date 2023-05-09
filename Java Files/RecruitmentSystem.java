import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitmentSystem {
    public static void main(String[] args) {

        Candidate candidate1 = new Candidate("Boobalan", new Date(1999, 10, 15),
                                         80, 75, 90, true,
                                   9.0, 8.5, 2, true,
                                      40.0, true);
        Candidate candidate2 = new Candidate("Chandran", new Date(2000, 02, 26),
                                         65,55, 80, true,
                                   8.0,8.5,1,true,
                                      45.0,true);
        Candidate candidate3 =  new Candidate("Boobalachandran", new Date(2001, 12, 1),
                                         90,90, 90, true ,
                                   9.5,9.5,3,true,
                                      50.0,true);
        RecruitingTeam recruitingTeam = new RecruitingTeam();
        HRTeam hrTeam = new HRTeam();

        // Check eligibility and conduct an interview for each candidate
        boolean isEligible1 = recruitingTeam.checkEligibility(candidate1);
        boolean isEligible2 = recruitingTeam.checkEligibility(candidate2);
        boolean isEligible3 = recruitingTeam.checkEligibility(candidate3);

        // Create a list of candidates
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(candidate1);
        candidates.add(candidate2);
        candidates.add(candidate3);

        // Inform the candidates of the results
        hrTeam.informCandidates(candidates);
    }
}