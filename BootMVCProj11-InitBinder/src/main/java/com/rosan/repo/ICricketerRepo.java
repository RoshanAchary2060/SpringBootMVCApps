package com.rosan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosan.model.Cricketer;

public interface ICricketerRepo extends JpaRepository<Cricketer, Integer> {

}
