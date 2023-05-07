package com.company.springbootgraphqlexample.service;

import com.company.springbootgraphqlexample.dto.UserDto;
import com.company.springbootgraphqlexample.dto.UserRequest;
import com.company.springbootgraphqlexample.exception.NotFoundException;
import com.company.springbootgraphqlexample.model.Role;
import com.company.springbootgraphqlexample.model.User;
import com.company.springbootgraphqlexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public List<UserDto> getUsers() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found !"));
        return modelMapper.map(user, UserDto.class);
    }

    public UserDto createUser(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setRole(Role.USER);
        user.setCreated(OffsetDateTime.now());
        user.setUpdated(OffsetDateTime.now());
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    public UserDto updateUser(Long id, UserRequest userRequest) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found !"));
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setUpdated(OffsetDateTime.now());
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found !"));
        userRepository.delete(user);
    }

}
