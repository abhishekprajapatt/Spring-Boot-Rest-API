package com.getuready.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getuready.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
