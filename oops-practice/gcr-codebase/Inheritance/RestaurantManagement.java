public class RestaurantManagement {
    static class Person {
        private String name;
        private int id;
        public Person(String name, int id) {
            this.name= name;
            this.id= id;
        }
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public void displayDetails() {
            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
        }
    }
    interface Worker {
        void performDuties();
    }
    static class Chef extends Person implements Worker {

        public Chef(String name,int id) {
            super(name, id);
        }

        @Override
        public void performDuties() {
            System.out.println("Chef is preparing meals");
        }
    }
    static class Waiter extends Person implements Worker {

        public Waiter(String name,int id) {
            super(name,id);
        }

        @Override
        public void performDuties() {
            System.out.println("Waiter is serving customers");
        }
    }
    public static void main(String[] args) {
        Person chef=new Chef("Kashish", 301);
        Person waiter=new Waiter("Aman", 101);

        chef.displayDetails();
        ((Worker) chef).performDuties();
        System.out.println();
        waiter.displayDetails();
        ((Worker) waiter).performDuties();
    }
}
