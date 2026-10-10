
package javacore;

// Reservation class
class Reservation {
    int seats = 10;

    // Only one thread can access this method at a time
    synchronized void reserve(String name, int requested) {
        System.out.println(name + " entered.");

        System.out.println("Available seats: " + seats
                + " Requested seats: " + requested);

        if (seats >= requested) {
            System.out.println("Seat Available. Reserve now :-)");
            seats = seats - requested;
            System.out.println(requested + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(name + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

// Person thread class
class Person extends Thread {
    Reservation r;
    int requested;

    Person(Reservation r, String name, int requested) {
        super(name);
        this.r = r;
        this.requested = requested;
    }

    public void run() {
        r.reserve(getName(), requested);
    }
}

// Main class
public class ReservationDemo {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        // Create three person threads
        Person p1 = new Person(r, "Person-1", 5);
        Person p2 = new Person(r, "Person-2", 2);
        Person p3 = new Person(r, "Person-3", 4);

        // Start the threads one by one
        p1.start();
        try {
            p1.join();
            p2.start();
            p2.join();
            p3.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
