package com.tagsoft.task.spring.repository;

import com.tagsoft.task.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
