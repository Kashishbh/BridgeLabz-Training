package iplCensorAnalyzer;

public class CensorUtil {

    // Mask team name
    public static String maskTeamName(String team) {
        if (team == null || !team.contains(" ")) {
            return team;
        }
        return team.split(" ")[0] + " ***";
    }

    // Redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}
