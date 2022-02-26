package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.repository.V1UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class V1GetUserByIdImpl(private val userRepository: V1UserRepository): V1GetUserById {

    override fun getUserById(userId: Long) = userRepository.findByIdOrNull(userId)?.from()
        ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User with id $userId does not exits")

}