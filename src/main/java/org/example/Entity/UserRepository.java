package org.example.Entity;

import java.util.*;

//singleton class
public class UserRepository {

    private static UserRepository instance=new UserRepository();
    List<User> userList;
    Map<String,User> userNameUserMap;

    private UserRepository() {
        userList=new ArrayList<>();
        userNameUserMap=new HashMap<>();
    }

    public static UserRepository getInstance() {
        return instance;
    }

    public static void setInstance(UserRepository instance) {
        UserRepository.instance = instance;
    }

    public List<User> getUserList() {
        return userList;
    }

    public UserRepository setUserList(List<User> userList) {
        this.userList = userList;
        return this;
    }

    public Map<String, User> getUserNameUserMap() {
        return userNameUserMap;
    }

    public UserRepository setUserNameUserMap(Map<String, User> userNameUserMap) {
        this.userNameUserMap = userNameUserMap;
        return this;
    }
}
