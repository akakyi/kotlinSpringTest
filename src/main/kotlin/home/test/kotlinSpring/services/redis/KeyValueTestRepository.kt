package home.test.kotlinSpring.services.redis

import org.springframework.data.keyvalue.repository.KeyValueRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface KeyValueTestRepository : KeyValueRepository<TestEntity, String>