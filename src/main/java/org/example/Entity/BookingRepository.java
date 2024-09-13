package org.example.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingRepository {
    private static BookingRepository instance=new BookingRepository();

    List<Booking> bookingList;
    Map<User,List<Booking>> userbookingMap;

    public BookingRepository() {
        this.bookingList = new ArrayList<>();
        this.userbookingMap = new HashMap<>();
    }

    public static BookingRepository getInstance() {
        return instance;
    }


    public List<Booking> getBookingList() {
        return bookingList;
    }

    public BookingRepository setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
        return this;
    }

    public Map<User, List<Booking>> getUserbookingMap() {
        return userbookingMap;
    }

    public BookingRepository setUserbookingMap(Map<User, List<Booking>> userbookingMap) {
        this.userbookingMap = userbookingMap;
        return this;
    }
    Booking getUserBookingListById(User user,int slotId){
        return userbookingMap.get(user).stream().filter(e->e.getSlot().getId()==slotId).findAny().orElseThrow();
    }
}