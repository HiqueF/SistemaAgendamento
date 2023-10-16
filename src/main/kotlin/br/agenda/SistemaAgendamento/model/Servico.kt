package br.agenda.SistemaAgendamento.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
data class Servico(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        @ManyToOne
        val usuario: Usuario,
        @ManyToOne
        val agendamento: Agendamento,
        val data: LocalDateTime = LocalDateTime.now()

)
