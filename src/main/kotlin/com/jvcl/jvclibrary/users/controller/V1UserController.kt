package com.jvcl.jvclibrary.users.controller

import com.jvcl.jvclibrary.users.dto.V1UserRequestDTO
import com.jvcl.jvclibrary.users.dto.V1UserResponseDTO
import com.jvcl.jvclibrary.users.services.V1CreateUserService
import com.jvcl.jvclibrary.users.services.V1GetAllUsers
import com.jvcl.jvclibrary.users.services.V1GetUserById
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/users")
class V1UserController (private val v1GetAllUsers: V1GetAllUsers, private val v1CreateUserService: V1CreateUserService,
                        private val v1GetUserById: V1GetUserById) {

    @GetMapping
    fun getUsers(): List<V1UserResponseDTO> = v1GetAllUsers.getAllUsers()

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Long): V1UserResponseDTO = v1GetUserById.getUserById(userId)

    @PostMapping
    fun createUser(@RequestBody v1UserRequestDTO: V1UserRequestDTO) = v1CreateUserService.createUser(v1UserRequestDTO)
}