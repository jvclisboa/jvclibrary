package com.jvcl.jvclibrary.users.dto

import com.jvcl.jvclibrary.users.model.V1User
import org.springframework.security.crypto.password.PasswordEncoder
import java.time.LocalDate


data class V1CreateUserDTO(val firstName: String, val lastName: String,
                           val username: String, val password: String, val birthDate: LocalDate) {
    companion object {
        fun V1CreateUserDTO.toEntity(passwordEncoder: PasswordEncoder) = V1User(
            firstName = firstName,
            lastName = lastName,
            username = username,
            password = passwordEncoder.encode(password),
            birthDate = birthDate)
    }
}