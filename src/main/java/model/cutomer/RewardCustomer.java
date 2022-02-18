/**
 * User: Poorvi
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.cutomer.RewardCustomer.java
 * JDK: Oracle JDK 17
 */

package model.cutomer;

import model.hotel.Hotel;
import model.hotel.Oyo;
import model.hotel.Radisson;
import model.hotel.Taj;

import javax.swing.*;

public final class RewardCustomer implements Customer{

    @Override
    public void bookHotel(Hotel hotel) {
        int bookingPrice=0;
        if(hotel instanceof Oyo){
            bookingPrice=hotel.getPrice(this);
        }
        else if(hotel instanceof Radisson){
            bookingPrice=hotel.getPrice(this);
        }
        else if(hotel instanceof Taj){
            bookingPrice=hotel.getPrice(this);
        }
        else{
            JOptionPane.showConfirmDialog(null,"You are not a Customer for any of the Hotels !!");
        }
        JOptionPane.showConfirmDialog(null,"here is your booking rate :"+bookingPrice+" $");
        return;
    }
}
