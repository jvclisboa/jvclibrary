package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1UserResponseDTO

fun interface V1GetAllUsers {
    fun getAllUsers() : List<V1UserResponseDTO>
}