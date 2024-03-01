package com.nobroker.service;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;

public interface UserService {

    User getUserByEmail(String email);

    public long createUser(UserDto userDto);

    public User registerUser(User user);

   public void verifyEmail(User user);

<<<<<<< HEAD
   public boolean isEmailVerified(String email);
=======

>>>>>>> origin/master
}
