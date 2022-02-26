package com.jvcl.jvclibrary.users.dto

import java.time.LocalDate


data class V1UserRequestDTO(val id : Long?, val firstName: String, val lastName: String,
                            val username: String, val password: String, val birthDate: LocalDate)