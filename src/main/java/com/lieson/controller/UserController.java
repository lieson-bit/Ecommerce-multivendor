package com.lieson.controller;

import com.lieson.model.User;
import com.lieson.model.VerificationCode;
import com.lieson.response.ApiResponse;
import com.lieson.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/profile")
    public ResponseEntity<User> getUserHandler(
            @RequestHeader("Authorization") String jwt
            ) throws Exception {
        User user=userService.findUserByJwtToken(jwt);

        return  ResponseEntity.ok(user);

    }
}
