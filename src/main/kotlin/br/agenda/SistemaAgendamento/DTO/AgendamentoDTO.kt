package br.agenda.SistemaAgendamento.DTO

import br.agenda.SistemaAgendamento.model.Agendamento
import br.agenda.SistemaAgendamento.model.StatusServico
import jakarta.validation.constraints.NotEmpty
import java.time.LocalDate
import java.time.LocalDateTime


data class AgendamentoDTO(
        @field:NotEmpty(message = "Informe o nome do Cliente")
        val nome: String,
        @field:NotEmpty(message = "Informe a data")
        val data: LocalDate,
        @field:NotEmpty(message = "Informe a data")
        val dataInicioInsc: LocalDateTime,
        @field:NotEmpty(message = "Informe a data")
        val dataFimInsc: LocalDateTime,
        val descricao: String,
        val valor: Float,
        val status: StatusServico
)
