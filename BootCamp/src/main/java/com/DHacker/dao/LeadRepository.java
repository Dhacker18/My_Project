package com.DHacker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DHacker.model.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
