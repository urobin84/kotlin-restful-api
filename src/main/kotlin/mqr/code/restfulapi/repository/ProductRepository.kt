package mqr.code.restfulapi.repository

import mqr.code.restfulapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {
}