package mqr.code.restfulapi.config

import mqr.code.restfulapi.entity.ApiKey
import mqr.code.restfulapi.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository) : ApplicationRunner{

    val apiKey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)){
            val entity = ApiKey(id=apiKey)
            apiKeyRepository.save(entity)
        }
    }
}