package ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "strategyType"
)
@JsonSubTypes(
    JsonSubTypes.Type(
        value = BasicStrategyHttpDto::class,
        name = "BASIC"
    ),
    JsonSubTypes.Type(
        value = ComplexStrategyHttpDto::class,
        name = "COMPLEX"
    ),
    JsonSubTypes.Type(
        value = OldStrategyHttpDto::class,
        name = "OLD"
    )
)
@Schema(
    description = "Стратегия списания средств с источника перевода"
//    oneOf = [
//        BasicStrategyHttpDto::class,
//        ComplexStrategyHttpDto::class,
//        OldStrategyHttpDto::class
//    ]
)
sealed interface FinancialOperationStandardSourceStrategyHttpDto {
    val privateOfficeId: Int
    val strategyType: RequestHttpStrategyType
}
