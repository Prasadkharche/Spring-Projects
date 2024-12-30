package com.passwordgenerator.password.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passwordgenerator.password.entity.user;
import com.passwordgenerator.password.repository.userRepository;

@Service
public class userService {
    
@Autowired
private userRepository userRepo;

    public String adddata(user user){
        userRepo.save(user);
        return "Success";
    }
    public String getPassword(Long id){
        Optional<user> userdemo = userRepo.findById(id);
        if(userdemo.isPresent()){
        user user = userdemo.get();
        String firstname =user.getFirstName();
        String middlename =user.getMiddleName();
        String lastname =user.getLastName();
        Random random = new Random();
        int randomThreeDigit = 100 + random.nextInt(900);
        return firstname.substring(0, 3)+middlename.substring(0, 3) + lastname.substring(0, 3) + randomThreeDigit;
        }
        return "wrong id passed";
    }

}
