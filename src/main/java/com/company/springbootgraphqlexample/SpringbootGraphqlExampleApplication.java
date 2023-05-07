package com.company.springbootgraphqlexample;

import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;


@SpringBootApplication
public class SpringbootGraphqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGraphqlExampleApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return new RuntimeWiringConfigurer() {
            @Override
            public void configure(RuntimeWiring.Builder builder) {
                builder.scalar(ExtendedScalars.DateTime);
            }
        };
    }


}
