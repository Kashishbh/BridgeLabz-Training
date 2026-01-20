package CinemaTime;

import java.util.ArrayList;
import java.util.List;

class CinemaManager {

    private List<String> titles;
    private List<String> showTimes;

    public CinemaManager() {
        titles = new ArrayList<>();
        showTimes = new ArrayList<>();
    }

    // Add movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {

        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }

        titles.add(title);
        showTimes.add(time);
        System.out.println("Movie added successfully.");
    }

    // Search movie using keyword
    public void searchMovie(String keyword) {
        boolean found = false;

        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(formatMovie(i));
                    found = true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed during search.");
        }

        if (!found) {
            System.out.println("No matching movies found.");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        if (titles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }

        for (int i = 0; i < titles.size(); i++) {
            System.out.println(formatMovie(i));
        }
    }

    // Convert list to array for report
    public String[] generateReport() {
        String[] report = new String[titles.size()];

        for (int i = 0; i < titles.size(); i++) {
            report[i] = formatMovie(i);
        }
        return report;
    }

    // Helper: format output
    private String formatMovie(int index) {
        return String.format("Movie: %s | Time: %s",
                titles.get(index), showTimes.get(index));
    }

    // Helper: validate time HH:MM
    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) return false;

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        return hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59;
    }
}
