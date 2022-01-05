package com.jvcl.jvclibrary.users.services

import com.jvcl.jvclibrary.users.dto.V1GetUserDTO

fun interface V1GetUserById {

    fun getUserById(userId: Long): V1GetUserDTO
}