package com.example.FitCheck.Service;

import com.example.FitCheck.dto.UserRequest;
import com.example.FitCheck.model.Login;
import com.example.FitCheck.model.User;
import com.example.FitCheck.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public String createId() {
        return "1";
    }
    public void saveUser(UserRequest user) {
        User userObj = User.builder()
                .id(user.getId())
                .username(user.getName())
                .password(user.getPassword())
                .name(user.getName())
                .build();
        userRepository.save(userObj);
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
