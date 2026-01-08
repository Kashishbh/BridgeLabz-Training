class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;
    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList {
    ItemNode head;
    void addAtStart(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void remove(int id) {
        if (head == null)
            return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    void update(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }
    void search(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
    void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equals(name)) {
                displayItem(temp);
            }
            temp = temp.next;
        }
    }
    void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }
    void sortByName() {
        ItemNode i, j;
        for (i = head; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.itemName.compareTo(j.itemName) > 0) {
                    swap(i, j);
                }
            }
        }
    }
    void sortByPrice() {
        ItemNode i, j;
        for (i = head; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.price > j.price) {
                    swap(i, j);
                }
            }
        }
    }

    void swap(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;
        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;
        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }
    void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    void displayItem(ItemNode i) {
        System.out.println(
            i.itemId + " " +
            i.itemName + " " +
            i.quantity + " " +
            i.price
        );
    }
}
public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        inventory.addAtStart(1, "Moble Phone", 5, 70000);
        inventory.addAtEnd(2, "Tablet", 20, 50000);
        inventory.addAtEnd(3, "Printer", 10, 1200);
        inventory.displayAll();
        inventory.update(1, 35);
        inventory.search(2);
        inventory.totalInventoryValue();
        inventory.sortByName();
        System.out.println("After Sorting by Name:");
        inventory.displayAll();
    }
}
