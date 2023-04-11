package home.test.kotlinSpring.dto

import io.swagger.v3.oas.annotations.media.Schema
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.BasicStrategyHttpDto
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.ComplexStrategyHttpDto
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.FinancialOperationStandardSourceStrategyHttpDto
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.OldStrategyHttpDto

data class Test1(
    @get:Schema(
//        hidden = true,
        description = "test",
//        oneOf = [
//            BasicStrategyHttpDto::class,
//            ComplexStrategyHttpDto::class,
//            OldStrategyHttpDto::class,
//        ]
//        implementation = FinancialOperationStandardSourceStrategyHttpDto::class
//        subTypes = [
//            BasicStrategyHttpDto::class,
//            ComplexStrategyHttpDto::class,
//            OldStrategyHttpDto::class,
//        ]
    )
    override val source: FinancialOperationStandardSourceStrategyHttpDto,
//    val source: FinancialOperationStandardSourceStrategyHttpDto,
    override val finIssueType: FinancialIssueType
) : FinIssueCreateWithSourceStrategyHttpRequest
//) : FinIssueCreateHttpRequest
