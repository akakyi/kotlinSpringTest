package home.test.kotlinSpring.dto

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema
import org.aspectj.weaver.ast.Test
import ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request.FinancialOperationStandardSourceStrategyHttpDto

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
@Schema(description = "Запрос на создание новой финансовой заявки")
sealed interface FinIssueCreateHttpRequest {
    @get:Schema(description = "Тип финансовой заявки")
    val finIssueType: FinancialIssueType
}
