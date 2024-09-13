package org.example.Entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class WorkOutCenterService {
    WorkOutCenterRepository workOutCenterRepository=WorkOutCenterRepository.getInstance();
    WorkOutRepository workOutRepository=new WorkOutRepository();
    public void addCenter(String centerName, String cityName, String[] daysClosed, int numberOfSlot){
        WorkoutCenter workoutCenter=new WorkoutCenter()
                .setCity(cityName)
                .setName(centerName)
                .setNonWorkingDays(daysClosed)
                .setNumberOfSlots(numberOfSlot);
        WorkoutCenter workoutCenter1=workOutCenterRepository.getWorkoutCenterMap().getOrDefault(workoutCenter.getName(),null);
        if(workoutCenter1!=null){
//            throw RuntimeException("center present with name")
        }else{
            workOutCenterRepository.workoutCenterMap.put(workoutCenter.getName(),workoutCenter);
            workOutCenterRepository.getWorkoutCenterList().add(workoutCenter);
        }
        System.out.println("ok");
    }
    public void addWorkOutType(String centerName,String name){
        name=name.toLowerCase();
        WorkoutCenter workoutCenter=workOutCenterRepository.getWorkoutCenterMap().get(centerName);
        if(workoutCenter==null){
//            throe new Runtime Exception();
        }
        else{
            WorkOutType workOutType=workOutRepository.getWorkOutTypeMap().get(name);
            if(workOutType==null){
                workOutType=new WorkOutType();
                workOutType.setWorkOutName(name);
                workOutRepository.getWorkOutTypeMap().put(name,workOutType);
            }
                workoutCenter.getWorkOutTypeSet().add(workOutType);
        }
    }

    public void addSlot(String centerName,String workoutType,String startTime,int numberOfseat){
        workoutType=workoutType.toLowerCase();
        WorkoutCenter workoutCenter=workOutCenterRepository.getWorkOutCenterByName(centerName);
        WorkOutType workOutType=workOutRepository.findByWorkOutType(workoutType);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String date=sdf.format(new Date());
        SimpleDateFormat timeFormat=new SimpleDateFormat("HH:mm");
        int slotId=Constants.slotId.incrementAndGet();
            Slot slot=new Slot()
                    .setId(slotId)
                    .setTotalSeats(numberOfseat)
                    .setWorkOutType(workOutType)
                    .setDate(date)
                    .setStartTime(startTime)
                    .setAvailbeSeats(numberOfseat);
            //if(totalSlot for today is lessthan )
            workoutCenter.getSlotList().add(slot);



    }
    public void getAvailableSlot(String centerName,String date){
        WorkoutCenter workoutCenter=workOutCenterRepository.getWorkOutCenterByName(centerName);
        List<Slot> slotList = workoutCenter.getSlotsByDate(date);
        for(Slot slot:slotList){
            System.out.println(slot.getId()+" "+centerName+" "+slot.getWorkOutType().getWorkOutName()+" "+slot.getAvailbeSeats());
        }
    }
}
