package br.agenda.SistemaAgendamento.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
data class Usuario(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val nome: String,
        val cidade: String,
        val telefone: String,
        val email: String? = null,
        val cpf: String? = null,
        @OneToMany(mappedBy = "usuario")
        val agendamento: List<Agendamento> = listOf()
)
