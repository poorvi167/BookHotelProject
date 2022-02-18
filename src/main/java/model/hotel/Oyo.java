/**
 * User: Poorvi
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.hotel.Oyo.java
 * JDK: Oracle JDK 17
 */

package model.hotel;

import model.cutomer.Customer;
import model.cutomer.RegularCustomer;
import model.cutomer.RewardCustomer;

import java.time.LocalDate;

public final class Oyo extends Hotel{
    @Override
    public int getRating() {
        return 4;
    }

    @Override
    public int getPrice(Customer customer) {
        int price=0;
        if(customer instanceof RegularCustomer){
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY") ){
                price=90;
            }
            else{
                price=130;
            }
        }
        else if(customer instanceof RewardCustomer){
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY") ){
                price=80;
            }
            else{
                price=90;
            }
        }

        return price;
    }
}
