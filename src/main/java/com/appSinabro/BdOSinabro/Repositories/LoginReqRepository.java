package com.appSinabro.BdOSinabro.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appSinabro.BdOSinabro.model.LoginRequest;

@Repository
public interface LoginReqRepository extends JpaRepository<LoginRequest, String>{

}