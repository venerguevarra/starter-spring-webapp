package com.bootcamp.web.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.web.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, UUID> {
}
