package com.jvcl.jvclibrary.users.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "users")
class V1User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") var id: Long? = null,
    @Column(name = "first_name") var firstName: String,
    @Column(name = "last_name") var lastName: String,
    @Column(name = "username") var username: String,
    @Column(name = "password") var password: String,
    @Column(name= "birth_date") var birthDate: LocalDate,
)