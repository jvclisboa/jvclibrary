package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1UserRequestDTO
import com.jvcl.jvclibrary.users.dto.V1UserResponseDTO
import com.jvcl.jvclibrary.users.model.V1User
import com.jvcl.jvclibrary.users.repository.V1UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class V1CreateUserServiceImpl(private val userRepository: V1UserRepository, private val passwordEncoder: PasswordEncoder): V1CreateUserService {

    override fun createUser(userDTO: V1UserRequestDTO): V1UserResponseDTO {
        val user = V1User(null,
            userDTO.firstName, userDTO.lastName, userDTO.username, passwordEncoder.encode(userDTO.password), userDTO.birthDate)
        userRepository.save(user)
        return user.from()
    }
}