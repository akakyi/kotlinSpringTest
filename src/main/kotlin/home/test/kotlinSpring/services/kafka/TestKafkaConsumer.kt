package home.test.kotlinSpring.services.kafka

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class TestKafkaConsumer {

    @KafkaListener(topics = ["TutorialTopic_1"], groupId = "testFirst")
    fun testListenerFirst(msg: String) {
        val iLoggerFactory = LoggerFactory.getILoggerFactory()
        val logger = iLoggerFactory.getLogger("testListenerFirst")
        logger.info(msg)
    }

//    @KafkaListener(topics = ["TutorialTopic_1"], groupId = "testSecond")
    fun testListenerSecond(msg: String) {
        if (msg == "flink") {
//            val executionEnvironment = ExecutionEnvironment.getExecutionEnvironment()
//            val set = executionEnvironment.fromElements(123.5, 4523.5465, 1234.342, 123.09)
//            val result = set
//                    .filter { it > 200 }
//                    .reduce { accum, curr ->
//                        accum / curr
//                    }
//                    .collect()
//                    .first()
//
            val iLoggerFactory = LoggerFactory.getILoggerFactory()
            val logger = iLoggerFactory.getLogger("testListenerSecond")
//            logger.info(result.toString())
            logger.info("FLINK")
        }
    }

}