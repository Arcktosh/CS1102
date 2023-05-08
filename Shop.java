public class Shop {
    private String name;
    private String address;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Shop Name: " + this.name);
        System.out.println("Address: " + this.address);
    }
    
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore("Black Books", "13 Little Bevan Street, Bloomsbury, London WC1", "Fiction");
        bookstore.displayDetails();
    }
}

class Bookstore extends Shop { //extend the shop by adding a genre
    private String genre;

    public Bookstore(String name, String address, String genre) {
        super(name, address);	// Call the variables of Shop
        this.genre = genre;		// Add a genre
    }

    public void displayDetails() {
        super.displayDetails(); // call a method from the parent class
        System.out.println("Genre: " + this.genre); // using 'this' to refer to a property from the current class.
    }
}
