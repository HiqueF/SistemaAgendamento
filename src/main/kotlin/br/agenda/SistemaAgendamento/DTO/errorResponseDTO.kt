package br.agenda.SistemaAgendamento.DTO

import java.time.LocalDateTime

data class errorResponseDTO(
        val timestamp: LocalDateTime = LocalDateTime.now(),
        val status: Int,
        val error: String,
        val massage: String,
        val path: String
)
