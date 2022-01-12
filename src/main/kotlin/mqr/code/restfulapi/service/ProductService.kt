package mqr.code.restfulapi.service

import mqr.code.restfulapi.model.CreateProductRequest
import mqr.code.restfulapi.model.ListProductRequest
import mqr.code.restfulapi.model.ProductResponse
import mqr.code.restfulapi.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}