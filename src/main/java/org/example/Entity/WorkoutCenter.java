package org.example.Entity;

import java.util.*;
import java.util.stream.Collectors;

public class WorkoutCenter {
    String id;
    String name;
    String city;
    Address address;
    Set<WorkOutType> workOutTypeSet=new HashSet<>();
    String[] nonWorkingDays;
    Integer numberOfSlots;
    List<Slot> slotList=new ArrayList<>();

    public Slot getSlotById(int id){
        return this.getSlotList().stream().filter(e->e.getId()==id).findAny().orElseThrow(()->new RuntimeException("Exception"));
    }
    public List<Slot> getSlotsByDate(String date){
//        List<Slot> result=new ArrayList<>();
        return this.getSlotList().stream().filter(e->e.getDate().equals(date)).collect(Collectors.toList());
    }


    public List<Slot> getSlotList() {
        return slotList;
    }

    public WorkoutCenter setSlotList(List<Slot> slotList) {
        this.slotList = slotList;
        return this;
    }

    public String getId() {
        return id;
    }

    public WorkoutCenter setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WorkoutCenter setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public WorkoutCenter setCity(String city) {
        this.city = city;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public WorkoutCenter setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Set<WorkOutType> getWorkOutTypeSet() {
        return workOutTypeSet;
    }

    public WorkoutCenter setWorkOutTypeSet(Set<WorkOutType> workOutTypeSet) {
        this.workOutTypeSet = workOutTypeSet;
        return this;
    }

    public String[] getNonWorkingDays() {
        return nonWorkingDays;
    }

    public WorkoutCenter setNonWorkingDays(String[] nonWorkingDays) {
        this.nonWorkingDays = nonWorkingDays;
        return this;
    }

    public Integer getNumberOfSlots() {
        return numberOfSlots;
    }

    public WorkoutCenter setNumberOfSlots(Integer numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        return this;
    }
}
