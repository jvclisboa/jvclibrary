package com.jvcl.jvclibrary.users.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "users")
class V1User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") val id: Long? = null,
    @Column(name = "first_name") val firstName: String,
    @Column(name = "last_name") val lastName: String,
    @Column(name = "username") val username: String,
    @Column(name = "password") val password: String,
    @Column(name= "birth_date") val birthDate: LocalDate,
)