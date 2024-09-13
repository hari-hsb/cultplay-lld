package org.example.Entity;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        userRepository=UserRepository.getInstance();
    }

    public void registerUser(String name,String age,String city){
        User user=new User(name,age,city);
        userRepository.getUserList().add(user);
        userRepository.getUserNameUserMap().put(user.name, user);
    }
}
