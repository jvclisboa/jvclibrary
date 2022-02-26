package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1UserResponseDTO

fun interface V1GetUserById {

    fun getUserById(userId: Long): V1UserResponseDTO
}