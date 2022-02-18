/**
 * User: Poorvi
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.hotel.Taj.java
 * JDK: Oracle JDK 17
 */

package model.hotel;

import model.cutomer.Customer;
import model.cutomer.RegularCustomer;
import model.cutomer.RewardCustomer;

import java.time.LocalDate;

public final class Taj extends Hotel{
    @Override
    public int getRating() {
        return 2;
    }

    @Override
    public int getPrice(Customer customer) {
        int price=0;
        if(customer instanceof RegularCustomer){
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY") ){
                price=110;
            }
            else{
                price=120;
            }
        }
        else if(customer instanceof RewardCustomer){
            if(LocalDate.now().getDayOfWeek().name().equals("SATURDAY") ||
                    LocalDate.now().getDayOfWeek().name().equals("SUNDAY") ){
                price=95;
            }
            else{
                price=105;
            }
        }

        return price;
    }

}
