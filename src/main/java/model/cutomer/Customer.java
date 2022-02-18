package model.cutomer;

import model.hotel.Hotel;

public sealed interface Customer permits RegularCustomer, RewardCustomer{
    void bookHotel(Hotel hotel);
}
