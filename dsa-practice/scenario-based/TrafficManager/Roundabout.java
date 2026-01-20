package TrafficManager;

class Roundabout {
    private Vehicle head;

    public Roundabout() {
        this.head = null;
    }

    // Add vehicle
    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        System.out.println("Vehicle " + number + " entered the roundabout.");
    }

    // Remove vehicle
    public void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle current = head;
        Vehicle previous = null;

        do {
            if (current.getVehicleNumber().equals(number)) {

                if (current == head && current.next == head) {
                    head = null;
                } 
                else if (current == head) {
                    Vehicle last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } 
                else {
                    previous.next = current.next;
                }

                System.out.println("Vehicle " + number + " exited the roundabout.");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Vehicle not found.");
    }

    // Display roundabout
    public void display() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.getVehicleNumber() + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to Start)");
    }
}
