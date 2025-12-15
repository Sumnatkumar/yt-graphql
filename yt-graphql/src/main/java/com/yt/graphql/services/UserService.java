package com.yt.graphql.services;

import com.yt.graphql.entities.User;
import com.yt.graphql.helper.ExceptionHelper;
import com.yt.graphql.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    //creating user

    public User createUser(User user){
        return userRepo.save(user);
    }

    //getting all users

    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    //getting single user

    public User getUser(int userId){
        User user = userRepo.findById(userId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
        return user;
    }

    // updating user
    // TODO::
    // deleting user

    public boolean deleteUser(int userId) {
        User user = userRepo.findById(userId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
        userRepo.delete(user);
        return true;
    }
}
