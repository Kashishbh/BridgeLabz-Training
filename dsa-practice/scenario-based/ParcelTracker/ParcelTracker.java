package ParcelTracker;

class ParcelTracker {

    private StageNode head;

    public ParcelTracker() {
        // Default delivery chain
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // Forward tracking
    public void trackParcel() {

        if (head == null) {
            System.out.println("Parcel tracking information missing!");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.getStageName());
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {

        StageNode temp = head;

        while (temp != null && !temp.getStageName().equalsIgnoreCase(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode checkpoint = new StageNode(newStage);
        checkpoint.next = temp.next;
        temp.next = checkpoint;

        System.out.println("Checkpoint added: " + newStage);
    }

    // Handle lost / missing parcel
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost. Tracking stopped.");
    }
}
