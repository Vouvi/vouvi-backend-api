package com.vouvi.api.repositories;

import com.vouvi.api.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VouviRepository extends JpaRepository<Users, Integer> {
    List<Users> findByUsername(String username);
}