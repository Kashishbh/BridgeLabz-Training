package BrowserBuddy;

import java.util.Stack;

class ClosedTabManager {

    private Stack<PageNode> closedTabs;

    public ClosedTabManager() {
        closedTabs = new Stack<>();
    }

    public void addClosedTab(PageNode tab) {
        if (tab != null)
            closedTabs.push(tab);
    }

    public PageNode reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore.");
            return null;
        }
        return closedTabs.pop();
    }
}
