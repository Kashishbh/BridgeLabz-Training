package NotificationFiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class NotificationFilteringMain {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Time for morning Medicine", "MEDICATION"));
        alerts.add(new Alert("Doctor appointment", "APPOINTMENT"));
        alerts.add(new Alert("Heart rate High", "EMERGENCY"));
        alerts.add(new Alert("Time for evening Medicine", "MEDICATION"));
        // User preference: only show MEDICATION alerts
        Predicate<Alert> medicationFilter = alert -> "MEDICATION".equals(alert.getType());
        List<Alert> filteredAlerts = alerts.stream().filter(medicationFilter).collect(Collectors.toList());
        System.out.println("Filtered Alerts (MEDICATION ):");
        filteredAlerts.forEach(System.out::println);
    }
}
