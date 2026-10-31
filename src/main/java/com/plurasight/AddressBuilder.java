package com.plurasight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");

        //asking for full name
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine().trim();

        //gathering the billing address info to a string
        StringBuilder userBillingAddrees = new StringBuilder();
        userBillingAddrees.append("Billing Address:\n");

        System.out.print("Enter billing Street: ");
        String billingStreet = scanner.nextLine().trim();
        userBillingAddrees.append(billingStreet + "\n");

        System.out.print("Enter billing City: ");
        String billingCity = scanner.nextLine().trim();
        userBillingAddrees.append(billingCity + ", ");

        System.out.print("Enter billing State(XX): ");
        String billingState =scanner.nextLine().trim();
        userBillingAddrees.append(billingState + " ");

        System.out.print("Enter billing zipcode: ");
        String billingZipcode =scanner.nextLine().trim();
        userBillingAddrees.append(billingZipcode);

        String billingAddress = userBillingAddrees.toString();

        //gathering the shipping address info to a string
        StringBuilder userShippingAddress = new StringBuilder();
        userShippingAddress.append("Shipping Address:\n");

        System.out.print("Enter shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();
        userShippingAddress.append(shippingStreet + "\n");

        System.out.print("Enter shipping City: ");
        String shippingCity = scanner.nextLine().trim();
        userShippingAddress.append(shippingCity + ", ");

        System.out.print("Enter shipping State(XX): ");
        String shippingState =scanner.nextLine().trim();
        userShippingAddress.append(shippingState +" ");

        System.out.print("Enter shipping zipcode: ");
        String shippingZipcode =scanner.nextLine().trim();
        userShippingAddress.append(shippingZipcode);

        String shippingAddress = userShippingAddress.toString();

        System.out.printf(fullName + "\n");
        System.out.printf("\n" + billingAddress + "\n");
        System.out.println("\n" + shippingAddress);

    }
}
