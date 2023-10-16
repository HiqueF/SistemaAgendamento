package br.agenda.SistemaAgendamento.DTO

import br.agenda.SistemaAgendamento.model.Servico
import br.agenda.SistemaAgendamento.model.StatusServico
import java.time.LocalDate
import java.time.LocalDateTime

data class AgendamentoResponseDTO(
        val id: Long?,
        val nome: String,
        val data: LocalDate,
        val dataInicioInsc: LocalDateTime,
        val dataFimInsc: LocalDateTime,
        val descricao: String,
        val status: StatusServico,
        val valor: Float,
        val agendados: List<Servico>
)

