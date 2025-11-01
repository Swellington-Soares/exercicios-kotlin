fun main() {
    val input = "Login ok Splash pendente Banco ok API pendente"//readlnOrNull()?.trim().orEmpty()

    val tokens = input.split(" ")

    // TODO: Percorra os pares (tarefa, status) e adicione à lista 'pendentes' apenas as tarefas com status "pendente"
    // Dica: Avance dois em dois e verifique o status correspondente
    val pendentes = tokens.chunked(2)
        .associate { (tarefa, situacao) ->
            tarefa to situacao
        }.filter { (_, value) -> value == "pendente" }
        .map { (tarefa) -> tarefa }

    // Exibe as tarefas pendentes, mantendo a ordem, ou a mensagem padrão caso não haja nenhuma
    if (pendentes.isNotEmpty()) {
        for (tarefa in pendentes) {
            println(tarefa)
        }
    } else {
        println("Projeto pronto")
    }
}