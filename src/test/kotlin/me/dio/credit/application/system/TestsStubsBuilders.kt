package me.dio.credit.application.system

import me.dio.credit.application.system.entity.Address
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.enummeration.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

internal object TestsStubsBuilders {
    fun buildCredit(
        creditCode: UUID = UUID.randomUUID(),
        creditValue: BigDecimal = BigDecimal.ONE,
        dayFirstInstallment: LocalDate = LocalDate.now(),
        numberOfInstallments: Int = 0,
        status: Status = Status.IN_PROGRESS,
        idCredit: Long? = 1L,
        customer: Customer = buildCustomer()
    ) = Credit(
        creditCode = creditCode,
        creditValue = creditValue,
        dayFirstInstallment = dayFirstInstallment,
        numberOfInstallments = numberOfInstallments,
        status = status,
        customer = customer,
        id = idCredit
    )

    fun buildCustomer(
        firstName: String = "Diego",
        lastName: String = "Cotta",
        cpf: String = "11111111111",
        email: String = "teste@teste.com",
        password: String = "12341234",
        zipCode: String = "12345678",
        street: String = "Rua Central",
        income: BigDecimal = BigDecimal.TEN,
        id: Long = 1L
    ) = Customer(
        firstName = firstName, lastName = lastName, cpf = cpf, email = email, password = password, address = Address(
            zipCode = zipCode,
            street = street,
        ), income = income, id = id
    )
}