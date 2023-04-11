package home.test.kotlinSpring.services.rel

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface HuiRepository : JpaRepository<Hui, Int> {

    @Query(
        value = "select id, a from hui",
        nativeQuery = true
    )
    fun test(): List<HuiProjection>

}