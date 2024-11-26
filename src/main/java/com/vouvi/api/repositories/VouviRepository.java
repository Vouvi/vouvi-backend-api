package com.vouvi.api.repositories;

import com.vouvi.api.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VouviRepository extends JpaRepository<Users, Integer> {
    List<Users> findByUsername(String username);
}