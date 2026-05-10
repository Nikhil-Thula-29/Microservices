package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.UserInformation;

@Repository
public interface UserRepo extends JpaRepository<UserInformation, String>{

}
