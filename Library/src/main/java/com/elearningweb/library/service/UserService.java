package com.elearningweb.library.service;

import com.elearningweb.library.dto.UserDto;
import com.elearningweb.library.model.User;

public interface UserService {
    User findByUsername(String username);
    User save(UserDto userDto);
//    void registerDafaultUser (User user);
}
