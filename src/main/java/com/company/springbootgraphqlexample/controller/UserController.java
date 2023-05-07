package com.company.springbootgraphqlexample.controller;

import com.company.springbootgraphqlexample.dto.UserDto;
import com.company.springbootgraphqlexample.dto.UserRequest;
import com.company.springbootgraphqlexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @QueryMapping
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @QueryMapping
    public UserDto getUserById(@Argument("id") Long id) {
        return userService.getUserById(id);
    }

    @MutationMapping
    public UserDto createUser(@Argument("userRequest") UserRequest userRequest) {
        return userService.createUser(userRequest);
    }

    @MutationMapping
    public UserDto updateUser(@Argument("id") Long id, @Argument("userRequest") UserRequest userRequest) {
        return userService.updateUser(id, userRequest);
    }

    @MutationMapping
    public boolean deleteUser(@Argument("id") Long id) {
        userService.deleteUser(id);
        return true;
    }

}
