package home.test.kotlinSpring.dto

enum class FinancialIssueType {

    //Списание услуг
    PAY_PPC_SERVICE,
    PAY_IO_SERVICE,
    PAY_SUPPORT_SERVICE,
    PAY_AD_SERVICE,
    PAY_RATE_SERVICE,
    PAY_OTHER_SERVICE,
    PAY_LOOSE_PACKAGE,
    PAY_SERVICE_TAX, //todo заявка не реализована

    //Переводы между кабинетами
    TRANSFER_AGENCY_TO_CLIENT,
    REFUND_CLIENT_TO_AGENCY,

    //Вывод денежных средств
    WITHDRAWAL_TO_BANK,
    WITHDRAWAL_TO_SOLAR,
    WITHDRAWAL_AGENCY_REWARD_TO_BANK,
    WITHDRAWAL_AGENCY_REWARD_TO_SOLAR,
    WITHDRAWAL_AGENCY_REWARD_LEGACY,

    //Штрафы
    FINE,

    //Оплата за инструменты
    PAY_REPORT_SUBSCRIBE,
    PAY_LINGVO_SUBSCRIBE,

    //Агентское вознаграждение
    TRANSFER_AGENCY_REWARD_TO_CONTRACT, //todo заявка не реализована
    REVERT_TRANSFER_AGENCY_REWARD_TO_CONTRACT, //todo заявка не реализована

    //Возвраты техническими бонусами с РС
    TECHBONUS_ADS_TO_CONTRACT,

    //Возвраты за услуги
    REFUND_SERVICE, //todo заявка не реализована

    //Овердрафт
    MNG_OVERDRAFT;

    companion object {
        //Списание услуг
        const val PAY_PPC_SERVICE_VALUE = "PAY_PPC_SERVICE"
        const val PAY_IO_SERVICE_VALUE = "PAY_IO_SERVICE"
        const val PAY_SUPPORT_SERVICE_VALUE = "PAY_SUPPORT_SERVICE"
        const val PAY_AD_SERVICE_VALUE = "PAY_AD_SERVICE"
        const val PAY_RATE_SERVICE_VALUE = "PAY_RATE_SERVICE"
        const val PAY_OTHER_SERVICE_VALUE = "PAY_OTHER_SERVICE"
        const val PAY_LOOSE_PACKAGE_VALUE = "PAY_LOOSE_PACKAGE"
        const val PAY_SERVICE_TAX_VALUE = "PAY_SERVICE_TAX"

        //Переводы между кабинетами
        const val REFUND_CLIENT_TO_AGENCY_VALUE = "REFUND_CLIENT_TO_AGENCY"
        const val TRANSFER_AGENCY_TO_CLIENT_VALUE = "TRANSFER_AGENCY_TO_CLIENT"

        //Вывод денежных средств
        const val WITHDRAWAL_TO_BANK_VALUE = "WITHDRAWAL_TO_BANK"
        const val WITHDRAWAL_TO_SOLAR_VALUE = "WITHDRAWAL_TO_SOLAR"
        const val WITHDRAWAL_AGENCY_REWARD_TO_BANK_VALUE = "WITHDRAWAL_AGENCY_REWARD_TO_BANK"
        const val WITHDRAWAL_AGENCY_REWARD_TO_SOLAR_VALUE = "WITHDRAWAL_AGENCY_REWARD_TO_SOLAR"

        //Штрафы
        const val FINE_VALUE = "FINE"

        //Оплата за инструменты
        const val PAY_REPORT_SUBSCRIBE_VALUE = "PAY_REPORT_SUBSCRIBE"
        const val PAY_LINGVO_SUBSCRIBE_VALUE = "PAY_LINGVO_SUBSCRIBE"

        //Агентское вознаграждение
        const val REVERT_TRANSFER_AGENCY_REWARD_TO_CONTRACT_VALUE = "REVERT_TRANSFER_AGENCY_REWARD_TO_CONTRACT"
        const val TRANSFER_AGENCY_REWARD_TO_CONTRACT_VALUE = "TRANSFER_AGENCY_REWARD_TO_CONTRACT"

        //Возвраты техническими бонусами с РС
        const val TECHBONUS_ADS_TO_CONTRACT_VALUE = "TECHBONUS_ADS_TO_CONTRACT"

        //Возвраты за услуги
        const val REFUND_SERVICE_VALUE = "REFUND_SERVICE"

        //овердрафт
        const val MNG_OVERDRAFT_VALUE = "MNG_OVERDRAFT"
    }

}
