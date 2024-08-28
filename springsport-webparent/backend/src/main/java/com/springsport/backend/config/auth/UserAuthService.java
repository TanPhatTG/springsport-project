package com.springsport.backend.config.auth;

import com.springsport.common.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserAuthService extends UserDetailsService {
    public User findByUserName(String userName);
}
