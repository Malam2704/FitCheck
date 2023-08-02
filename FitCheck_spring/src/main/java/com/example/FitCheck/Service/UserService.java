package com.example.FitCheck.Service;

import com.example.FitCheck.model.User;
import com.example.FitCheck.repository.UserRepository;
import org.springframework.data.annotation.Id;

public class UserService {
    private UserRepository userRepository;

    public String createId() {
        return "1";
    }
    public String saveUser(User user) {
        User user1 = User.builder()
                .id(createId())
                .username("USERNAME")
                .password("PASSWORD")
                .name("NAME")
                .build();

        userRepository.save(user1);
        return "";
    }

    public String updateUser(User user) {


        return "";
    }

    public String deleteUser(int Id) {
        return "";
    }

    public User Login(String username, String pasword) {
        return null;
    }
}
