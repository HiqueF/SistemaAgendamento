package br.agenda.SistemaAgendamento.exceptions

import java.lang.RuntimeException

class NotFoundException (override val message: String) : RuntimeException()

