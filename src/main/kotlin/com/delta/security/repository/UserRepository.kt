package com.delta.security.repository

import com.delta.security.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface UserRepository : MongoRepository<User?, String?> {
    fun findByUsername(username: String?): Optional<User?>?
    fun existsByUsername(username: String?): Boolean?
    fun findByMobile(mobile: String?): User?
    fun existsByMobile(mobile: String?): Boolean?
}