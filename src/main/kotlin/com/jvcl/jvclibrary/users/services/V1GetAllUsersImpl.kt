package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1GetUserDTO.Companion.toV1GetUserDTO
import com.jvcl.jvclibrary.users.repository.V1UserRepository
import org.springframework.stereotype.Service

@Service
class V1GetAllUsersImpl(private val userRepository: V1UserRepository) : V1GetAllUsers {

    override fun getAllUsers() = userRepository.findAll().map {user -> user.toV1GetUserDTO()}
}