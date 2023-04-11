package ru.elama.billing.shared.entrypoints.http.dto.financialoperations.strategy.request

/**
 * Допустимый тип страгии переводов в запросах
 */
enum class RequestHttpStrategyType {
    BASIC,
    COMPLEX,
    OLD
}
