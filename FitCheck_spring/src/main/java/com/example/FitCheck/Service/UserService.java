package com.example.FitCheck.Service;

import com.example.FitCheck.model.Login;
import com.example.FitCheck.model.User;
import com.example.FitCheck.repository.UserRepository;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

@Service
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
        return "success";
    }

    public String updateUser(User user) {


        return "";
    }

    public String deleteUser(int Id) {
        return "";
    }

    public User Login(Login login) {
        return null;
    }

    public User sample() {
        User sampleU = new User("1","username","password","name");

        return sampleU;
    }
}
