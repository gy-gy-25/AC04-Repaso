//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val temps = listOf(18.5, 31.2, 25.0, 34.8, 29.9)

    // Filtrar las temperaturas mayores a 30 grados
    println(temps.filter { it > 30.0 })

    // Convertir las temperaturas filtradas a Fahrenheit
    println(temps.filter { it > 30.0 }.map { it * 9/5 + 32 })

    // Imprimir las temperaturas filtradas y convertidas a Fahrenheit
    temps.filter { it > 30.0 }.map { it * 9/5 + 32 }.forEach(::println)

    // Calcular la media de las temperaturas
    println("La media de las temperaturas es: ${temps.average()}")

    // Calcular la temperatura máxima tratando el caso de que la lista esté vacía
    val maxima = temps.maxOrNull() ?: 0.0
    println("La temperatura máxima es: $maxima")

}