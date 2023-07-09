package org.example.chapter1;

import java.util.LinkedList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new LinkedList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for(Rental rental: rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.getMovie().getCharge(rental.getDaysRented()) + "\n";
        }
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() +
                " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double totalCharge = 0;
        for(Rental rental: rentals) {
            totalCharge += rental.getMovie().getCharge(rental.getDaysRented()) ;

        }
        return totalCharge;
    }

    private int getTotalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for(Rental rental: rentals) {
            totalFrequentRenterPoints += rental.getMovie().getFrequentRenterPoints(rental.getDaysRented());

        }
        return totalFrequentRenterPoints;
    }
}
