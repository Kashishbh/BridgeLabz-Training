package OnlineVoting;

public class OnlineVotingSystem {
    public static void main(String[] args) {

        ElectionService service = new ElectionServiceImpl();

        service.registerVoter(new Voter(1, "Kashish"));
        service.registerVoter(new Voter(2, "Navya"));

        service.addCandidate(new Candidate(101, "Candidate 1"));
        service.addCandidate(new Candidate(102, "Candidate 2"));

        try {
            service.castVote(1, 101);
            service.castVote(2, 102);
            service.castVote(1, 102); // Duplicate vote
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        service.declareResult();
    }
}

