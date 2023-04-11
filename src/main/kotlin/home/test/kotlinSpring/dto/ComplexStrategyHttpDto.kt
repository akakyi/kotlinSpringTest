package ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request

import io.swagger.v3.oas.annotations.media.Schema
import java.util.*

@Schema(description = "Стратегия COMPLEX")
class ComplexStrategyHttpDto(
    @Schema(description = "Идентификатор кабинета")
    override val privateOfficeId: Int,
    @Schema(description = "Список идентификаторов договоров")
    val contractIdList: List<UUID>,
    @Schema(description = "Список идентификаторов кошельков")
    val walletIdList: List<UUID>
) : FinancialOperationStandardSourceStrategyHttpDto {
    @Schema(description = "Тип стратегии")
    override val strategyType: RequestHttpStrategyType = RequestHttpStrategyType.COMPLEX
}
