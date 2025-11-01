import java.lang.Exception

fun main() {
    // Lê a entrada do usuário (ex: "app,1.0")
    val input = "app,"//readLine()

    try {
        // TODO: Validar a estrutura da entrada e extrair as informações separadas por vírgula (nome do app e versão)
        val info = input.split(",").filter { it.isNotBlank() }


        if (info.size < 2) {
            throw Exception("Formato inválido")
        }
        println("${info[0]}: ${info[1]}")
        // Dica: Garanta que haja exatamente dois itens não vazios após a separação

        // Se chegar aqui, significa que a entrada está correta (após implementação!)
        // println("<nome>: <versao>")

    } catch (e: Exception) {
        // Em qualquer erro de formato, imprime a mensagem padrão
        println("Erro de formato")
    }
}