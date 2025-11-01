import java.lang.Exception

// Classe de exceção customizada
class PacoteInvalidoException : Exception()

// Função utilitária para validar o pacote
fun validarPacote(pacote: String) {
    // TODO: Implemente a validação conforme as regras do Android
    // Dica: Utilize expressões regulares e checagens extras se necessário
    // - Apenas letras minúsculas, dígitos e pontos são permitidos
    // - Não pode começar ou terminar com ponto nem ter dois pontos consecutivos
    if (!pacote.matches(Regex("^[A-Za-z]+(\\.[A-Za-z]+)*$"))) {
        throw PacoteInvalidoException()
    }
}

fun main() {
    val entrada = readLine()?.trim() ?: ""

    try {
        validarPacote(entrada)
        println("Pacote aceito")
    } catch (e: PacoteInvalidoException) {
        println("Pacote invalido")
    }
}