package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1UserRequestDTO
import com.jvcl.jvclibrary.users.dto.V1UserResponseDTO

@FunctionalInterface
interface V1CreateUserService {
    fun createUser(userDTO: V1UserRequestDTO): V1UserResponseDTO
}