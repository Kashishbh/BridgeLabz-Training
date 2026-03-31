package BrowserBuddy;

import java.util.Scanner;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserHistory history = new BrowserHistory();
        ClosedTabManager tabManager = new ClosedTabManager();

        while (true) {
            System.out.println("\nBrowser Buddy Menu --");
            System.out.println("1. Open Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Restore Closed Tab");
            System.out.println("6. Show Current Page");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    history.openPage(sc.nextLine());
                    break;

                case 2:
                    history.goBack();
                    break;

                case 3:
                    history.goForward();
                    break;

                case 4:
                    tabManager.addClosedTab(history.closeTab());
                    break;

                case 5:
                    history.restoreTab(tabManager.reopenTab());
                    break;

                case 6:
                    history.showCurrentPage();
                    break;

                case 7:
                    System.out.println("Browser closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
