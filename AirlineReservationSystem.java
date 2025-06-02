
import java.util.*;

class Passenger {
    private int passengerID;
    private String name;
    private String email;
    private String phone;
    private String passportNumber;

    public void viewProfile() {
        System.out.println("Viewing profile for: " + name);
    }

    public void updateProfile(String name, String email, String phone, String passportNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passportNumber = passportNumber;
    }
}

class Reservation {
    private int reservationID;
    private Date date;
    private String status;
    private Passenger passenger;
    private Flight flight;
    private List<Ticket> tickets = new ArrayList<>();

    public void createReservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
        this.date = new Date();
        this.status = "Confirmed";
        System.out.println("Reservation created.");
    }

    public void cancelReservation() {
        this.status = "Cancelled";
        System.out.println("Reservation cancelled.");
    }

    public void viewReservation() {
        System.out.println("Reservation ID: " + reservationID + ", Status: " + status);
    }
}

class Ticket {
    private int ticketID;
    private String seatNumber;
    private String classType;
    private double price;

    public void generateTicket(String seatNumber, String classType, double price) {
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.price = price;
    }

    public void printTicket() {
        System.out.println("Ticket: Seat " + seatNumber + ", Class: " + classType + ", Price: " + price);
    }
}

class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private Date departureTime;
    private Date arrivalTime;
    private Airplane airplane;
    private List<Employee> crew = new ArrayList<>();

    public void viewFlightDetails() {
        System.out.println("Flight " + flightNumber + " from " + origin + " to " + destination);
    }

    public void checkAvailability() {
        System.out.println("Checking availability for flight " + flightNumber);
    }
}

class Airplane {
    private String planeID;
    private String model;
    private int capacity;

    public void viewPlaneInfo() {
        System.out.println("Airplane Model: " + model + ", Capacity: " + capacity);
    }
}

abstract class Employee {
    protected int employeeID;
    protected String name;
    protected String contact;

    public void viewDetails() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + name);
    }

    public void updateDetails(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
}

class Pilot extends Employee {
    private String licenseNumber;
    private int experienceYears;

    public void assignFlight(Flight flight) {
        System.out.println("Pilot " + name + " assigned to flight.");
    }
}

class Crew extends Employee {
    private String role;

    public void assignToFlight(Flight flight) {
        System.out.println(role + " " + name + " assigned to flight.");
    }
}
