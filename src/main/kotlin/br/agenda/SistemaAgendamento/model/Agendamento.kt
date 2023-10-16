package br.agenda.SistemaAgendamento.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
data class Agendamento(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val nome: String,
        val data: LocalDate,
        val dataInicioServico: LocalDateTime,
        val dataFimServico: LocalDateTime,
        val descricao: String,
        @Enumerated(value = EnumType.STRING)
        val status: StatusServico,
        val valor: Float,
        @OneToMany(mappedBy = "Agendamento")
        val agendados: List<Servico> = listOf()
)
