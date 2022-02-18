/**
 * User: Poorvi
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.hotel.Hotel.java
 * JDK: Oracle JDK 17
 */

package model.hotel;

import model.cutomer.Customer;

public sealed abstract class Hotel permits Oyo, Radisson, Taj{
    private int rating;
    private int price;

    public int getRating() {
        return rating;
    }

    public int getPrice(Customer customer) {
        return price;
    }
}
