import java.util.Date;

// Abstract Room class
abstract class Room {
    protected int roomNumber;
    protected double price;
    protected boolean isBooked;

    // Constructor
    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Book the room
    public void bookRoom() {
        isBooked = true;
    }

    // Abstract method for calculating total price (implemented differently in subclasses)
    public abstract double calculateTotalPrice();

    // Method to display room information
    public void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price per night: $" + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }
}

// StandardRoom class inherits Room
class StandardRoom extends Room {
    public StandardRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    // Implement calculateTotalPrice for StandardRoom
    @Override
    public double calculateTotalPrice() {
        return price; // No additional charges
    }
}

// LuxuryRoom class inherits Room
class LuxuryRoom extends Room {
    private String amenities;

    public LuxuryRoom(int roomNumber, double price, String amenities) {
        super(roomNumber, price);
        this.amenities = amenities;
    }

    // Implement calculateTotalPrice for LuxuryRoom with a surcharge
    @Override
    public double calculateTotalPrice() {
        return price * 1.2; // 20% surcharge for luxury amenities
    }

    // Override displayInfo to include amenities
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Amenities: " + amenities);
    }
}

// The Guest class
class Guest {
    private String name;

    // Constructor
    public Guest(String name) {
        this.name = name;
    }

    // Get the guest's name
    public String getName() {
        return name;
    }
}

// The Booking class links Room and Guest
class Booking {
    private Room room;
    private Guest guest;
    private Date checkInDate;
    private Date checkOutDate;

    // Constructor to initialize a booking
    public Booking(Room room, Guest guest, Date checkInDate, Date checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

        // Book the room when creating a booking
        room.bookRoom();
    }

    // Display booking information
    public void displayBookingInfo() {
        System.out.println("Booking Details:");
        room.displayInfo();
        System.out.println("Guest Name: " + guest.getName());
        System.out.println("Check-In Date: " + checkInDate);
        System.out.println("Check-Out Date: " + checkOutDate);
        System.out.println("Total Price: $" + room.calculateTotalPrice());
    }
}

// Main class
public class HotelBookingSystem {
    public static void main(String[] args) {
        // Create rooms of different types
        Room standardRoom = new StandardRoom(101, 100.0);
        Room luxuryRoom = new LuxuryRoom(102, 200.0, "Ocean View, King Bed, Mini Bar");

        // Create a guest
        Guest guest1 = new Guest("Njuguna Kelvin");

        // Create bookings
        Booking booking1 = new Booking(standardRoom, guest1, new Date(), new Date());
        Booking booking2 = new Booking(luxuryRoom, guest1, new Date(), new Date());

        // Display booking information
        booking1.displayBookingInfo();
        System.out.println();
        booking2.displayBookingInfo();
    }
}
