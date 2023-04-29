package com.company.springbootgraphqlexample.auth;

import com.company.springbootgraphqlexample.request.LoginRequest;
import com.company.springbootgraphqlexample.request.RegisterRequest;
import com.company.springbootgraphqlexample.response.AuthenticationResponse;
import com.company.springbootgraphqlexample.service.AuthenticationService;
import graphql.annotations.annotationTypes.GraphQLMutation;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class AuthenticationControllerByGraphQL {

    private final AuthenticationService authService;

    @MutationMapping
    public AuthenticationResponse register(@Argument RegisterRequest registerRequest) {
        return authService.register(registerRequest);
    }

    @MutationMapping
    public AuthenticationResponse login(@Argument LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }


}
