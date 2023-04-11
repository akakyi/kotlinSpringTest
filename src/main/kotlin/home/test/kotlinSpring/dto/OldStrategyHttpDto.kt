package ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Стратегия OLD")
class OldStrategyHttpDto(
    @Schema(description = "Идентификатор кабинета")
    override val privateOfficeId: Int,
) : FinancialOperationStandardSourceStrategyHttpDto {
    @Schema(description = "Тип стратегии")
    override val strategyType: RequestHttpStrategyType = RequestHttpStrategyType.OLD
}
