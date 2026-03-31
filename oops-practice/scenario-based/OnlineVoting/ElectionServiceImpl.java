package OnlineVoting;

import java.util.ArrayList;
import java.util.List;

public class ElectionServiceImpl extends ElectionService {

    private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    @Override
    public void registerVoter(Voter voter) {
        voters.add(voter);
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    @Override
    public void castVote(int voterId, int candidateId)
            throws DuplicateVoteException {

        Voter voter = null;
        Candidate candidate = null;

        for (Voter v : voters) {
            if (v.getVoterId() == voterId) {
                voter = v;
                break;
            }
        }

        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter has already voted!");
        }

        for (Candidate c : candidates) {
            if (c.getCandidateId() == candidateId) {
                candidate = c;
                break;
            }
        }

        candidate.addVote();
        voter.markVoted();
        votes.add(new Vote(voter, candidate));
    }

    @Override
    public void declareResult() {
        System.out.println("Election Results:");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " : " + c.getVotes());
        }
    }
}
