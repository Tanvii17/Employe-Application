package com.employeeApplication.service;

import com.employeeApplication.Entity.User;
import com.employeeApplication.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto userRegistrationDto);
}
