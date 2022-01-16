package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1GetUserDTO.Companion.toV1GetUserDTO
import com.jvcl.jvclibrary.users.repository.V1UserRepository
import org.springframework.stereotype.Service

@Service
class V1GetUserByIdImpl(private val userRepository: V1UserRepository): V1GetUserById {

    override fun getUserById(userId: Long) = userRepository.findById(userId).orElse(null).toV1GetUserDTO()
}