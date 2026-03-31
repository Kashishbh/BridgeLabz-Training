package InsurancePolicyManagement;

import java.time.LocalDate;

public class InsurancePolicyMain{
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Kam", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P102", "Praney", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P103", "Vamika", LocalDate.now().minusDays(5)));
        manager.addPolicy(new Policy("P104", "Mesi", LocalDate.now().plusDays(25)));

        // Retrieve policy
        System.out.println("Retrieve policy P101:");
        System.out.println(manager.getPolicyByNumber("P101"));

        // Policies expiring soon
        manager.listPoliciesExpiringSoon();

        // Policies by holder
        manager.listPoliciesByHolder("Praney");

        // Remove expired policies
        manager.removeExpiredPolicies();

        // Display insertion order
        manager.displayInsertionOrder();
    }
}
