package com.hengetech.simple_demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hengetech.simple_demo.model.Gi;

public interface GiRepo extends JpaRepository<Gi, String> {
    
}
