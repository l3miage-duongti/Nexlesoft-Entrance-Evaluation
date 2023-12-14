package com.nexlesoft.evalution.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nexlesoft.evalution.repository.UserRepository;
import com.nexlesoft.evalution.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    
    private final UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String userName){
                return userRepository.findByEmail(userName)
                        .orElseThrow(() -> new UsernameNotFoundException("user not found"));
            }
        };
    }
}
