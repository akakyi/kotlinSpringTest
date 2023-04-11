package home.test.kotlinSpring.services

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.xhtmlrenderer.pdf.ITextRenderer
import java.io.File
import java.io.FileOutputStream

@RestController
class MockServerLolHehMeh {

    @PostMapping("/done")
    fun done(@RequestBody body: String) {
        println(body)
    }

}