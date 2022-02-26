package com.jvcl.jvclibrary.users.model

import com.jvcl.jvclibrary.users.dto.V1UserResponseDTO
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "users")
data class V1User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") val id: Long? = null,
    @Column(name = "first_name") val firstName: String,
    @Column(name = "last_name") val lastName: String,
    @Column(name = "username") val username: String,
    @Column(name = "password") val password: String,
    @Column(name= "birth_date") val birthDate: LocalDate,
) {
    fun from(): V1UserResponseDTO =
        V1UserResponseDTO(
            id = id,
            firstName = firstName,
            lastName = lastName,
            username = username,
            birthDate = birthDate)

}