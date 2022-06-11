package com.example.demo.dao;

import com.example.demo.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Balance,Long> {
}
