package br.agenda.SistemaAgendamento.DTO

data class UsuarioResponseDTO(val id: Long? = null,
                              val nome: String,
                              val cidade: String,
                              val telefone: String)
