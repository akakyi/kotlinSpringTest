package home.test.kotlinSpring.services.rel

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "hui")
//class Hui(
//    @Id
//    val id: Int,
//    val a: Int,
//    val b: String
//)
class Hui {
    @Id
    var id: Int? = null
    var a: Int? = null
    var b: String? = null
}
