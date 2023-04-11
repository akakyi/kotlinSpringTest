package home.test.kotlinSpring.services.redis

import org.springframework.data.annotation.Id
import org.springframework.data.keyvalue.annotation.KeySpace

//@RedisHash("RedisTestEntity")
@KeySpace("testSpace")
data class TestEntity(
    @Id
    val id: String,
    val valueSecond: Long
)
