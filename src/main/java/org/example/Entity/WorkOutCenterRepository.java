package org.example.Entity;

import java.util.*;

public class WorkOutCenterRepository {
    private static WorkOutCenterRepository instance=new WorkOutCenterRepository();
    List<WorkoutCenter> workoutCenterList;
    Map<String,WorkoutCenter> workoutCenterMap;

    private WorkOutCenterRepository() {
        workoutCenterList=new ArrayList<>();
        workoutCenterMap=new HashMap<>();
    }

    public static WorkOutCenterRepository getInstance() {
        return instance;
    }

    public List<WorkoutCenter> getWorkoutCenterList() {
        return workoutCenterList;
    }

    public WorkOutCenterRepository setWorkoutCenterList(List<WorkoutCenter> workoutCenterList) {
        this.workoutCenterList = workoutCenterList;
        return this;
    }

    public Map<String, WorkoutCenter> getWorkoutCenterMap() {
        return workoutCenterMap;
    }

    public WorkOutCenterRepository setWorkoutCenterMap(Map<String, WorkoutCenter> workoutCenterMap) {
        this.workoutCenterMap = workoutCenterMap;
        return this;
    }
    public WorkoutCenter getWorkOutCenterByName(String centerName){
        return workoutCenterMap.getOrDefault(centerName,null);
    }
}
