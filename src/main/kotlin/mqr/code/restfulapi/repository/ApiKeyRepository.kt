package mqr.code.restfulapi.repository

import mqr.code.restfulapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository:JpaRepository<ApiKey, String> {
}