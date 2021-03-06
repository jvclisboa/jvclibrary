package com.jvcl.jvclibrary.users.repository

import com.jvcl.jvclibrary.users.model.V1User
import org.springframework.data.jpa.repository.JpaRepository

interface V1UserRepository: JpaRepository<V1User, Long>