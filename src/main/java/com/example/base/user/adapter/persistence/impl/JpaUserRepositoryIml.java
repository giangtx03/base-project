package com.example.base.user.adapter.persistence.impl;

import com.example.base.user.adapter.persistence.JpaUserRepository;
import com.example.base.user.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository("jpa")
@RequiredArgsConstructor
public class JpaUserRepositoryIml implements UserRepository {
    private final JpaUserRepository userRepository;
}
