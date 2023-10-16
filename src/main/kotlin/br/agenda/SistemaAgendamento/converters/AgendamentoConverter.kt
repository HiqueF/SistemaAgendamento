package br.agenda.SistemaAgendamento.converters

import br.agenda.SistemaAgendamento.DTO.AgendamentoDTO
import br.agenda.SistemaAgendamento.DTO.AgendamentoResponseDTO
import br.agenda.SistemaAgendamento.model.Agendamento
import org.springframework.stereotype.Component

@Component
class AgendamentoConverter {
    fun toAgendamento(dto: AgendamentoDTO): Agendamento {
        return Agendamento(
                nome = dto.nome,
                data = dto.data,
                dataInicioServico =  dto.dataInicioInsc,
                dataFimServico = dto.dataFimInsc,
                descricao = dto.descricao,
                status = dto.status,
                valor = dto.valor
        )
    }
    fun toAgendaResponseDTO(agendamentos: Agendamento): AgendamentoResponseDTO {
        return AgendamentoResponseDTO(
                id = agendamentos.id,
                nome = agendamentos.nome,
                data = agendamentos.data,
                dataInicioInsc = agendamentos.dataInicioServico,
                dataFimInsc = agendamentos.dataFimServico,
                descricao = agendamentos.descricao,
                status = agendamentos.status,
                valor = agendamentos.valor,
                agendados = agendamentos.agendados
        )
    }
}