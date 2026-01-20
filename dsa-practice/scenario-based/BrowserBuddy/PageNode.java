package BrowserBuddy;

class PageNode {
    private String url;
    PageNode prev;
    PageNode next;

    public PageNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }
}
