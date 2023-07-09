package org.example;

import org.example.chapter1.Customer;
import org.example.chapter1.Movie;
import org.example.chapter1.Rental;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Manreet");
        Movie newMovie = new Movie("Tume mile", 1);
        Movie regular = new Movie("Ajnabi", 0);
        Movie children = new Movie("Pikachu", 2);
        Rental newMovieRental = new Rental(newMovie, 2);
        Rental regularRntal = new Rental(regular, 2);
        Rental childrenRntal = new Rental(children, 3);
        customer.addRental(newMovieRental);
        customer.addRental(regularRntal);
        customer.addRental(childrenRntal);

       String manreetStatement = customer.statement();
        System.out.println(manreetStatement);
       String expectedStatement = "Rental Record for Manreet\n\tTume mile\t6.0\n\tAjnabi\t2.0\n\tPikachu\t1.5\nAmount owed is 9.5\nYou earned 4 frequent renter points";
        System.out.println(manreetStatement.equals(expectedStatement));

        Customer raman = new Customer("raman");
        newMovieRental = new Rental(newMovie, 3);
        regularRntal = new Rental(regular, 1);
        childrenRntal = new Rental(children, 4);
        raman.addRental(newMovieRental);
        raman.addRental(regularRntal);
        raman.addRental(childrenRntal);

        String ramanStatement = raman.statement();
        System.out.println(ramanStatement);
        expectedStatement = "Rental Record for raman\n\tTume mile\t9.0\n\tAjnabi\t2.0\n\tPikachu\t3.0\nAmount owed is 14.0\nYou earned 4 frequent renter points";
        System.out.println(ramanStatement.equals(expectedStatement));

        raman = new Customer("raman");
        newMovieRental = new Rental(newMovie, 1);
        regularRntal = new Rental(regular, 1);
        childrenRntal = new Rental(children, 4);
        raman.addRental(newMovieRental);
        raman.addRental(regularRntal);
        raman.addRental(childrenRntal);

        ramanStatement = raman.statement();
        System.out.println(ramanStatement);
        expectedStatement = "Rental Record for raman\n\tTume mile\t3.0\n\tAjnabi\t2.0\n\tPikachu\t3.0\nAmount owed is 8.0\nYou earned 3 frequent renter points";
        System.out.println(ramanStatement.equals(expectedStatement));


    }
}