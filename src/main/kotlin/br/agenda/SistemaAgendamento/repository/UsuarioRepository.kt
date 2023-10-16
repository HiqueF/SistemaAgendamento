package br.agenda.SistemaAgendamento.repository


import br.agenda.SistemaAgendamento.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository: JpaRepository<Usuario, Long> {
}
