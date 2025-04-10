package com.example.base.user.usecase;

import com.example.base.user.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase {
    private final UserRepository userRepository;

    void execute(){}
}
