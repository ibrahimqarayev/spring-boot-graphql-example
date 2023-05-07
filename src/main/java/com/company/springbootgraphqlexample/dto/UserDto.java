package com.company.springbootgraphqlexample.dto;

import com.company.springbootgraphqlexample.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role;
    private OffsetDateTime created;
    private OffsetDateTime updated;
}
