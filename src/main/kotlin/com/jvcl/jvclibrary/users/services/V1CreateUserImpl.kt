package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1CreateUserDTO
import com.jvcl.jvclibrary.users.dto.V1CreateUserDTO.Companion.toEntity
import com.jvcl.jvclibrary.users.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class V1CreateUserImpl(private val userRepository: UserRepository, private val passwordEncoder: PasswordEncoder): V1CreateUser {

    override fun createUser(createUserDTO: V1CreateUserDTO) {
        userRepository.save(createUserDTO.toEntity(passwordEncoder))
    }
}