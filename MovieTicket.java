import java.util.Scanner;

class Ticket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    Ticket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0;
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\n--- Cinema Ticket Booking Bill ---");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: %.2f%n", calculateTotal());
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }
}

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        Ticket ticket = new Ticket(
            movieName, ticketPrice, numberOfTickets
        );

        ticket.displayBill();

        sc.close();
    }
}