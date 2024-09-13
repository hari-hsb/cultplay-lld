package org.example.Entity;

import java.util.HashMap;
import java.util.Map;

public class WorkOutRepository {
    public static Map<String,WorkOutType> workOutTypeMap=new HashMap<>();

    public Map<String, WorkOutType> getWorkOutTypeMap() {
        return workOutTypeMap;
    }

//    public WorkOutRepository setWorkOutTypeMap(Map<String, WorkOutType> workOutTypeMap) {
//        this.workOutTypeMap = workOutTypeMap;
//        return this;
//    }

    public WorkOutType findByWorkOutType(String workoutType) {
        return this.workOutTypeMap.getOrDefault(workoutType,null);
    }
}
