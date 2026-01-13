package OnlineVoting;
public class Candidate {
    private int candidateId;
    private String name;
    private int votes;

    public Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
        this.votes = 0;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void addVote() {
        votes++;
    }

    public int getVotes() {
        return votes;
    }

    public String getName() {
        return name;
    }
}
