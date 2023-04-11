package home.test.kotlinSpring.services

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder
import home.test.kotlinSpring.dto.FinIssueCreateHttpRequest
import home.test.kotlinSpring.dto.FinIssueCreateWithSourceStrategyHttpRequest
import home.test.kotlinSpring.dto.Test1
import home.test.kotlinSpring.services.redis.KeyValueTestRepository
import home.test.kotlinSpring.services.redis.TestEntity
import home.test.kotlinSpring.services.rel.HuiRepository
import org.jsoup.Jsoup
import org.jsoup.helper.W3CDom
import org.jsoup.nodes.Document
import org.springframework.core.io.ResourceLoader
import org.springframework.web.bind.annotation.*
import org.thymeleaf.TemplateEngine
import org.thymeleaf.context.Context
import org.thymeleaf.templatemode.TemplateMode
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver
import java.io.FileOutputStream
import java.util.Base64


@RestController
@RequestMapping("/test")
class TestEndPoint(
//    private val redisTestRepository: RedisTestRepository
//    private val keyValueTestRepository: KeyValueTestRepository,
    private val huiRepository: HuiRepository,
//    private val resourceLoader: ResourceLoader
) {

    @PostMapping("/test")
    fun test(@RequestBody test: FinIssueCreateHttpRequest) {
//        backOfficeCreateFinancialIssueUseCase.execute(
//            CreateFineInDto(
//                privateOfficeId = 801,
//                walletId = UUID.fromString("34510bb9-73df-4101-b4ba-f70c7175e2ce"),
//                contractId = UUID.fromString("95e58af2-0028-429e-9901-d45993a961ab"),
//                amount = Money.getByHRV(BigDecimal.valueOf(10), UseCaseCurrency.RUB),
//                comment = "test"
//            )
//        )
    }

    @PostMapping("/test1")
    fun test1(@RequestBody test: FinIssueCreateWithSourceStrategyHttpRequest) {
//        backOfficeCreateFinancialIssueUseCase.execute(
//            CreateFineInDto(
//                privateOfficeId = 801,
//                walletId = UUID.fromString("34510bb9-73df-4101-b4ba-f70c7175e2ce"),
//                contractId = UUID.fromString("95e58af2-0028-429e-9901-d45993a961ab"),
//                amount = Money.getByHRV(BigDecimal.valueOf(10), UseCaseCurrency.RUB),
//                comment = "test"
//            )
//        )
    }

    @GetMapping
    fun testGet() {
        val test = huiRepository.test()
        test.forEach {
            println("id: ${it.id}, a: ${it.a}")
        }

//        val entity = redisTestRepository.findById("hui")
//        val entity = keyValueTestRepository.findById("hui")
//        val logger = LoggerFactory.getLogger(this::class.java)
//        if (entity.isPresent) {
//            logger.info(entity.get().toString())
//        } else {
//            logger.error("NOT FOUND!!!!")
//        }

//        val inputHtml =
//            resourceLoader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX + "conversion/pdf/templates/newDoc.html")
//        val document = Jsoup.parse(String(inputHtml.inputStream.readAllBytes()))

//        val img =
//            resourceLoader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX + "conversion/pdf/templates/Java_logo.png")
//        val bytes = img.inputStream.readAllBytes()
//        val encoded = Base64.getEncoder().encode(bytes)
//
//        val inputHtml = parseThymeleafTemplate("data:image/png;base64,${String(encoded)}")
//        val document = Jsoup.parse(inputHtml)
//        document.outputSettings().syntax(Document.OutputSettings.Syntax.xml)
//        println(document)
//
//        val baseResource = resourceLoader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX + "conversion/pdf/templates")
////        val baseUrl = "/home/akakyi/projects/kotlinSpring/src/main/resources/conversion/pdf/templates"
//        val fileOutputStream = FileOutputStream("/home/akakyi/Documents/newDocOpenPdf.pdf")
//
//        val builder = PdfRendererBuilder()
//        builder.withUri("/home/akakyi/Documents/newDocOpenPdf.pdf")
//        builder.toStream(fileOutputStream)
//        builder.withW3cDocument(W3CDom().fromJsoup(document), baseResource.uri.toString())
//        builder.run()
//        fileOutputStream.close()

//        =============================
////        val inputHtml = File("/home/akakyi/Documents/newDoc.html")
////        val inputHtml = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "conversion/pdf/templates/newDoc.html")
//        val inputHtml =
//            resourceLoader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX + "conversion/pdf/templates/newDoc.html")
//        val document = Jsoup.parse(String(inputHtml.inputStream.readAllBytes()))
//        document.outputSettings().syntax(Document.OutputSettings.Syntax.xml)
//        println(document.body())
//        println("========================")
//        println(document.html())
//        println("========================")
//
//        val fileOutputStream = FileOutputStream("/home/akakyi/Documents/newDoc.pdf")
//        val renderer = ITextRenderer()
//        val sharedContext = renderer.sharedContext
//        sharedContext.isPrint = true
//        sharedContext.isInteractive = false
//
//        renderer.setDocumentFromString(document.html())
//        renderer.layout()
//        renderer.createPDF(fileOutputStream)
//        fileOutputStream.close()
    }

    @PostMapping
    fun testPost() {
//        val test = TestEntity(id = "hui", valueSecond = 1)
////        redisTestRepository.save(test)
//        keyValueTestRepository.save(test)
//    }
//
//    private fun parseThymeleafTemplate(src: String): String {
//        val templateResolver = ClassLoaderTemplateResolver()
//        templateResolver.suffix = ".html"
//        templateResolver.templateMode = TemplateMode.HTML
//        templateResolver.characterEncoding = Charsets.UTF_8.name()
//        val templateEngine = TemplateEngine()
//        templateEngine.setTemplateResolver(templateResolver)
//        val context = Context()
//        context.setVariable("src", src)
//        return templateEngine.process("newDoc", context)
    }

}