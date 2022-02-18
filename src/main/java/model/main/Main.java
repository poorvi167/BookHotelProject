/**
 * User: Poorvi
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.main.Main.java
 * JDK: Oracle JDK 17
 */

package model.main;

import model.cutomer.Customer;
import model.cutomer.RegularCustomer;
import model.cutomer.RewardCustomer;
import model.hotel.Hotel;
import model.hotel.Radisson;
import model.hotel.Taj;

import javax.swing.text.DefaultEditorKit;

public class Main {
    public static void main(String[] args) {
        Hotel hotel=new Radisson();
        Customer customer1=new RegularCustomer();
        Customer customer2=new RewardCustomer();
        customer1.bookHotel(hotel);
        customer2.bookHotel(hotel);
    }
}
