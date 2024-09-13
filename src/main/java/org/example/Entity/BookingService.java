package org.example.Entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookingService {
   WorkOutCenterRepository workOutCenterRepository;
   UserRepository userRepository;
   BookingRepository bookingRepository;
    Lock lock= new ReentrantLock();

   void bookSlot(String centerName,String userName,int slotId){
       WorkoutCenter workoutCenter=workOutCenterRepository.getWorkOutCenterByName(centerName);
       Slot slot=workoutCenter.getSlotById(slotId);
       User user=userRepository.userNameUserMap.get(userName);
       lock.lock();
       try{
           if(slot.getAvailbeSeats()>0){
               //booking possible
               Booking booking=new Booking().setSlot(slot).setUser(user);
               bookingRepository.getBookingList().add(booking);
               bookingRepository.getUserbookingMap().getOrDefault(user,null);
               slot.setAvailbeSeats(slot.availbeSeats-1);
           }
       }catch (Exception e){

       }finally {
           lock.unlock();
       }

   }

}
