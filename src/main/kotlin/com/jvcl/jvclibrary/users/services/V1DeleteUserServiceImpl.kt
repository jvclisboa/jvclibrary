package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.model.V1User
import com.jvcl.jvclibrary.users.repository.V1UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class V1DeleteUserServiceImpl(private val userRepository: V1UserRepository): V1DeleteUserService {

    override fun deleteUser(userId: Long) {
        val user: V1User = userRepository.findByIdOrNull(userId)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User with id $userId does not exists")
        userRepository.delete(user)
    }
}