package com.lieson.service;

import com.lieson.domain.USER_ROLE;
import com.lieson.request.LoginRequest;
import com.lieson.response.AuthResponse;
import com.lieson.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email, USER_ROLE role) throws Exception;
    String createUser(SignupRequest req) throws Exception;
    AuthResponse signing(LoginRequest req) throws Exception;
}
