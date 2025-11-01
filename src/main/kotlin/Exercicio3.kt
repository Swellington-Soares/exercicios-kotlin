class Tarefa(val titulo: String, val concluida: Boolean) {
    // Retorna a representação formatada da tarefa conforme o status
    fun formatar(): String {
        return "$titulo - ${if (concluida) "Concluida" else "Pendente"}"
    }
}

fun main() {
    // Leitura do título da tarefa (string sem espaços)
    val tituloInput = readLine() ?: ""

    // Leitura do status da tarefa ("sim" ou "nao")
    val statusInput = readLine() ?: ""

    // Conversão do status para Boolean de forma robusta
    // Considera "sim" (case insensitive) => true, qualquer outra coisa => false
    val estaConcluida = statusInput.trim().lowercase() == "sim"

    // Instancia a tarefa com os dados de entrada
    val tarefa = Tarefa(tituloInput, estaConcluida)

    // Imprime a linha formatada representando a tarefa
    println(tarefa.formatar())
}