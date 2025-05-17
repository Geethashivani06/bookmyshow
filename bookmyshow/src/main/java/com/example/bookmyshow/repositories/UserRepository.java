package com.example.bookmyshow.repositories;

import com.example.bookmyshow.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository {
    UserEntity findByuserName(String userName);
    UserEntity findByEmail(String email);
}



