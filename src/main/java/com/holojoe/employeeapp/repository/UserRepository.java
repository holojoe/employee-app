package com.holojoe.employeeapp.repository;

import java.util.List;

import com.holojoe.employeeapp.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    List<User> findByName(String name);
}
