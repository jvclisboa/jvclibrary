package com.jvcl.jvclibrary.users.dto

import java.time.LocalDate

data class V1UserResponseDTO(val id : Long?, val firstName: String, val lastName: String,
                             val username: String, val birthDate: LocalDate
)
