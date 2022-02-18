/**
 * User: Poorvi
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.hotel.Radisson.java
 * JDK: Oracle JDK 17
 */

package model.hotel;

import model.cutomer.Customer;
import model.cutomer.RegularCustomer;
import model.cutomer.RewardCustomer;

import java.time.LocalDate;

public final class Radisson extends Hotel{
    @Override
    public int getRating() {
        return 3;
    }

    @Override
    public int getPrice(Customer customer) {
        int price=0;
        if(customer instanceof RegularCustomer){
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY") ){
                price=100;
            }
            else{
                price=110;
            }
        }
        else if(customer instanceof RewardCustomer){
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY") ){
                price=90;
            }
            else{
                price=100;
            }
        }

        return price;

    }
}
