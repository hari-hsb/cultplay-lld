package org.example.Entity;

public class Booking {
    Integer id;
    User user;
    Slot slot;

    public Integer getId() {
        return id;
    }

    public Booking setId(Integer id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Booking setUser(User user) {
        this.user = user;
        return this;
    }

    public Slot getSlot() {
        return slot;
    }

    public Booking setSlot(Slot slot) {
        this.slot = slot;
        return this;
    }
    //    STATE ;
}
