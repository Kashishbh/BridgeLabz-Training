public class CarRental {
	String customerName;
    String carModel;
    int rentalDays;
    double price;
    double totalCost;

    
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.price = 1500;
        calculateTotalCost();
    }

    
    void calculateTotalCost() {
        totalCost = rentalDays * price;
    }

   
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + totalCost);
    }
	public static void main(String[] args) {
		 CarRental rental1 = new CarRental("Rohan", "Hyundai Creta", 3);
	     rental1.displayDetails();
	}

}
