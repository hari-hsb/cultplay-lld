package org.example;

import org.example.Entity.UserRepository;
import org.example.Entity.UserService;
import org.example.Entity.WorkOutCenterService;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String[] strings=new String[]{"01:00","02:00","11:00","24:00"};
//        Arrays.sort(strings, Comparator.reverseOrder());
//        init();

        addCenter("bellandur","bangalore",new String[]{"monday","sunday"}, 5);
        addWorkOutType("bellandur","weights");
        addWorkOutType("bellandur","cardio");
        addWorkOutType("bellandur","yoga");
        addSlots("bellandur","weights","06:00","2");
        addSlots("bellandur","Yoga","08:00","1");
        getAvailableSlot("bellandur","13-09-2024");//time in 24hr format
        registerUser("Vivek","16","bangalore");
        registerUser("Pavan","20","bangalore");
        registerUser("Varun","22","bangalore");
    }

    private static void registerUser(String name, String age, String city) {
        UserService userService=new UserService();
        userService.registerUser(name,age,city);
    }

    private static void getAvailableSlot(String centerName, String s) {
        WorkOutCenterService workOutCenterService=new WorkOutCenterService();
        workOutCenterService.getAvailableSlot(centerName,s);
    }

    private static void addSlots(String centerName, String workOutType, String time, String number) {
        WorkOutCenterService workOutCenterService=new WorkOutCenterService();
        workOutCenterService.addSlot(centerName,workOutType,time,Integer.parseInt(number));
    }

    private static void addWorkOutType(String centerName, String workoutType) {
        WorkOutCenterService workOutCenterService=new WorkOutCenterService();
        workOutCenterService.addWorkOutType(centerName,workoutType);
    }

//    private static void init() {
//        WorkOutCenterService workOutCenterService=new WorkOutCenterService();
//    }

    public static void addCenter(String centerName, String cityName, String[] daysClosed, int numberOfSlot){
        WorkOutCenterService workOutCenterService=new WorkOutCenterService();
        workOutCenterService.addCenter(centerName,cityName,daysClosed,numberOfSlot);
    }
}