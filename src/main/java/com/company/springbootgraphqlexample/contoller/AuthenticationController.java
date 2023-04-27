package com.company.springbootgraphqlexample.contoller;

import com.company.springbootgraphqlexample.dto.UserDto;
import com.company.springbootgraphqlexample.dto.UserLoginDto;
import com.company.springbootgraphqlexample.dto.UserRegisterDto;
import com.company.springbootgraphqlexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserRegisterDto registerDto) {
        userService.register(registerDto);
    }

    @PostMapping("/login")
    public void login(@RequestBody UserLoginDto userLoginDto) {
        userService.login(userLoginDto));
    }


}
