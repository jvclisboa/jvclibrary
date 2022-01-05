package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1CreateUserDTO

@FunctionalInterface
interface V1CreateUser {
    fun createUser(createUserDTO: V1CreateUserDTO)
}