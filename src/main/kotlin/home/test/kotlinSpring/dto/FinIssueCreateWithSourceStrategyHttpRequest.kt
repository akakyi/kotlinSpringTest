package home.test.kotlinSpring.dto

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.BasicStrategyHttpDto
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.ComplexStrategyHttpDto
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.FinancialOperationStandardSourceStrategyHttpDto
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.OldStrategyHttpDto

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "finIssueType"
)
@JsonSubTypes(
    JsonSubTypes.Type(
        value = Test1::class,
        name = FinancialIssueType.TRANSFER_AGENCY_TO_CLIENT_VALUE
    )
)
sealed interface FinIssueCreateWithSourceStrategyHttpRequest : FinIssueCreateHttpRequest {
    @get:Schema(
        description = "Стратегия источника перевода"
//        oneOf = [
//            BasicStrategyHttpDto::class,
//            ComplexStrategyHttpDto::class,
//            OldStrategyHttpDto::class,
//        ]
    )
    val source: FinancialOperationStandardSourceStrategyHttpDto
}