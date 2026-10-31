package com.plurasight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Enter billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.print("Enter billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.print("Enter billing State(XX): ");
        String billingState =scanner.nextLine().trim();

        System.out.print("Enter billing zipcode: ");
        String billingZipcode =scanner.nextLine().trim();


        System.out.print("Enter shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();

        System.out.print("Enter shipping City: ");
        String shippingCity = scanner.nextLine().trim();

        System.out.print("Enter shipping State(XX): ");
        String shippingState =scanner.nextLine().trim();

        System.out.print("Enter shipping zipcode: ");
        String shippingZipcode =scanner.nextLine().trim();




    }
}
