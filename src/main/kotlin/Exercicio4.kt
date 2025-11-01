import java.util.Scanner

// Modelagem simples de um App usando Programação Orientada a Objetos
data class App(val nome: String, val nota: Int)

fun main() {
    // Leitura da entrada padrão em uma única linha
    val linhaEntrada = readLine() ?: return

    // Dividindo por vírgula para obter cada app no formato "nome:nota"
    val apps = linhaEntrada.split(",").map { item ->
        // Para cada item, separa nome e nota
        val partes = item.split(":")
        val nome = partes[0]
        val nota = partes[1].toInt()
        App(nome, nota)
    }

    // TODO: Encontrando o app com maior nota na lista "apps".
    // Dica: Se houver empate, o primeiro da lista será escolhido naturalmente por maxByOrNull
    val melhorApp = apps.maxBy { it.nota }

    // Imprime apenas o nome do app com maior nota
    if (melhorApp != null) {
        println(melhorApp.nome)
    }
}