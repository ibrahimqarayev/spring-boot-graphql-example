package com.company.springbootgraphqlexample.service;

import com.company.springbootgraphqlexample.dto.UserDto;
import com.company.springbootgraphqlexample.entity.User;
import com.company.springbootgraphqlexample.exception.DuplicateResourceException;
import com.company.springbootgraphqlexample.exception.ResourceNotFoundException;
import com.company.springbootgraphqlexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;



}
