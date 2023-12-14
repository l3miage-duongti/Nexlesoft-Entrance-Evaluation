package com.nexlesoft.evalution.service;

import com.nexlesoft.evalution.dto.SignUpRequest;
import com.nexlesoft.evalution.model.User;

public interface AuthenticationService {
    
    User signup(SignUpRequest signUpRequest);
}
