package org.example.Entity;


import java.util.Date;

public class Slot {
    Integer id;
    WorkOutType workOutType;
    String date;
    String StartTime;
    Integer totalSeats;
    Integer totalWaitListedSeats;
    Integer availbeSeats;
    Integer avilableWaitListedSeats;

    public Integer getId() {
        return id;
    }

    public Slot setId(Integer id) {
        this.id = id;
        return this;
    }

    public WorkOutType getWorkOutType() {
        return workOutType;
    }

    public Slot setWorkOutType(WorkOutType workOutType) {
        this.workOutType = workOutType;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Slot setDate(String date) {
        this.date = date;
        return this;
    }

    public String getStartTime() {
        return StartTime;
    }

    public Slot setStartTime(String startTime) {
        StartTime = startTime;
        return this;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public Slot setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
        return this;
    }

    public Integer getTotalWaitListedSeats() {
        return totalWaitListedSeats;
    }

    public Slot setTotalWaitListedSeats(Integer totalWaitListedSeats) {
        this.totalWaitListedSeats = totalWaitListedSeats;
        return this;
    }

    public Integer getAvailbeSeats() {
        return availbeSeats;
    }

    public Slot setAvailbeSeats(Integer availbeSeats) {
        this.availbeSeats = availbeSeats;
        return this;
    }

    public Integer getAvilableWaitListedSeats() {
        return avilableWaitListedSeats;
    }

    public Slot setAvilableWaitListedSeats(Integer avilableWaitListedSeats) {
        this.avilableWaitListedSeats = avilableWaitListedSeats;
        return this;
    }
}
