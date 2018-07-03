package com.yhyecho.repository;

import com.yhyecho.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Echo on 7/3/18.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
