package com.jvcl.jvclibrary.users.dto

import com.jvcl.jvclibrary.users.model.V1User
import java.time.LocalDate

data class V1GetUserDTO(val userId: Long?, val name: String, val username: String, val birthDate: LocalDate) {

    companion object {
        fun V1User.toV1GetUserDTO() = V1GetUserDTO(
            userId = id,
            name = "$firstName $lastName",
            username = username,
            birthDate = birthDate)
    }
}

