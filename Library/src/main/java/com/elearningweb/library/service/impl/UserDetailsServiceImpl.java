package com.elearningweb.library.service.impl;

import com.elearningweb.library.dto.UserDto;
import com.elearningweb.library.model.ERole;
import com.elearningweb.library.model.Role;
import com.elearningweb.library.model.User;
import com.elearningweb.library.repository.RoleRepository;
import com.elearningweb.library.repository.UserRepository;
import com.elearningweb.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
@Service
public class UserDetailsServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User();
        Role role = roleRepository.findByName("USER");
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        if(role == null) {
            role = new Role();
            role.setName("USER");
        }
        user.setRoles(Collections.singletonList(role));
        return userRepository.save(user);
    }

}
