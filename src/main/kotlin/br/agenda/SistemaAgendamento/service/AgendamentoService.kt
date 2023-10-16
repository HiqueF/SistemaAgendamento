package br.agenda.SistemaAgendamento.service

import org.springframework.data.domain.Pageable
import br.agenda.SistemaAgendamento.DTO.AgendamentoDTO
import br.agenda.SistemaAgendamento.DTO.AgendamentoResponseDTO
import br.agenda.SistemaAgendamento.converters.AgendamentoConverter
import br.agenda.SistemaAgendamento.exceptions.NotFoundException
import br.agenda.SistemaAgendamento.repository.AgendamentoRepository
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

private const val USUARIO_NOT_FOUND_MESSAGE = "Usuário não encontrado!"

@Service
class AgendamentoService (private val repository: AgendamentoRepository, private val converter: AgendamentoConverter){
    fun listar(
            nomeEvento: String?,
            paginacao: Pageable): Page<AgendamentoResponseDTO> {
        val eventos = if (nomeEvento == null) {
            repository.findAll(paginacao)
        } else {
            repository.findByNome(nomeEvento, paginacao)
        }
        return eventos
                .map(converter::toAgendaResponseDTO)
    }

    fun buscarPorId(id: Long): AgendamentoResponseDTO {
        val agenda = repository.findById(id)
                .orElseThrow{ NotFoundException(USUARIO_NOT_FOUND_MESSAGE)}
        return converter.toAgendaResponseDTO(agenda)
    }

    fun cadastrar(dto: AgendamentoDTO): AgendamentoResponseDTO {
        return converter.toAgendaResponseDTO(repository.save(converter.toAgendamento(dto)))
    }

    fun atualizar(id: Long, dto: AgendamentoDTO): AgendamentoResponseDTO {
        val agenda = repository.findById(id)
                .orElseThrow {NotFoundException(USUARIO_NOT_FOUND_MESSAGE)}
                .copy(
                        nome = dto.nome,
                        data = dto.data,
                        dataInicioServico = dto.dataInicioInsc,
                        dataFimServico = dto.dataFimInsc,
                        status = dto.status,
                        valor = dto.valor,
                        descricao = dto.descricao
                )
        return converter.toAgendaResponseDTO(repository.save(agenda))
    }

    fun deletar(id: Long) {
        repository.deleteById(id)
    }

}