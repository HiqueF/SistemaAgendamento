package br.agenda.SistemaAgendamento.repository


import br.agenda.SistemaAgendamento.model.Servico
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ServicoRepository: JpaRepository<Servico, Long> {
}