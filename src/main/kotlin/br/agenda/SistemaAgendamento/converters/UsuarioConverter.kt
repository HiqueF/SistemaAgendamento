package br.agenda.SistemaAgendamento.converters


import br.agenda.SistemaAgendamento.DTO.UsuarioDTO
import br.agenda.SistemaAgendamento.DTO.UsuarioResponseDTO
import br.agenda.SistemaAgendamento.model.Usuario
import org.springframework.stereotype.Component

@Component
class UsuarioConverter {
    fun toUsuarioResponseDTO(usuario: Usuario): UsuarioResponseDTO {
        return UsuarioResponseDTO(
            id = usuario.id,
            nome = usuario.nome,
            cidade = usuario.cidade,
            telefone = usuario.telefone
        )
    }

    fun toUsuario(dto: UsuarioDTO): Usuario {
        return Usuario(
            nome = dto.nome,
            cidade = dto.cidade,
            telefone = dto.telefone
        )
    }
}
