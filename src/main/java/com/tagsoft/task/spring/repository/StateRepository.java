package com.tagsoft.task.spring.repository;

import com.tagsoft.task.spring.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Integer> {
}
