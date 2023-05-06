package com.company.springbootgraphqlexample.repository;

import com.company.springbootgraphqlexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
