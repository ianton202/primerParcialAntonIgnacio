package edu.uade.primerparcial

data class Pokemon(
    val name: String,
    val url: String
) {
    val id: Int = url.trimEnd('/').substringAfterLast('/').toIntOrNull() ?: 0
    val spriteUrl: String = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png"
    val nameFormatted: String = name.replaceFirstChar { it.uppercase() }
}