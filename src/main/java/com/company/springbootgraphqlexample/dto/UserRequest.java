package com.company.springbootgraphqlexample.dto;

import com.company.springbootgraphqlexample.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private Long id;
    private String username;
    private String email;
    private Role role;

}
