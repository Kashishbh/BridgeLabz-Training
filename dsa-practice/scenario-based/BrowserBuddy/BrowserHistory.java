package BrowserBuddy;

class BrowserHistory {

    private PageNode current;

    // Open a new page
    public void openPage(String url) {
        PageNode newPage = new PageNode(url);

        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }

        current = newPage;
        System.out.println("Opened: " + url);
    }

    // Back navigation
    public void goBack() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page.");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.getUrl());
    }

    // Forward navigation
    public void goForward() {
        if (current == null || current.next == null) {
            System.out.println("No forward page.");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.getUrl());
    }

    public PageNode closeTab() {
        if (current == null) {
            System.out.println("No tab to close.");
            return null;
        }

        PageNode closed = current;

        if (current.prev != null) {
            current = current.prev;
            current.next = null;
        } else {
            current = null;
        }

        System.out.println("Closed tab: " + closed.getUrl());
        return closed;
    }

    public void restoreTab(PageNode node) {
        if (node == null) return;

        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;

        System.out.println("Restored tab: " + node.getUrl());
    }

    public void showCurrentPage() {
        if (current == null)
            System.out.println("No active tab.");
        else
            System.out.println("Current Page: " + current.getUrl());
    }
}

