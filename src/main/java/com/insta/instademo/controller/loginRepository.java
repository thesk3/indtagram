package com.insta.instademo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<LoginVO, Long>{

}
