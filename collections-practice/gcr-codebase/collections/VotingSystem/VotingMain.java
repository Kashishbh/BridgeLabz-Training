package VotingSystem;
public class VotingMain{
    public static void main(String[] args) {

        VotingManager manager = new VotingManager();

        manager.castVote("kami");
        manager.castVote("rishi");
        manager.castVote("muskan");
        manager.castVote("kash");
        manager.castVote("kanchi");

        manager.displayInsertionOrder();
        manager.displaySortedResults();
    }
}
