data class Application(
    val name: String,
    val category: Category,
    val downloads: Long,
    val rating: Double,
    val size: Double
) {
    // Learned about require from:
    // https://stackoverflow.com/questions/46874406/how-to-implement-a-validating-constructor-in-kotlin
    // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/require.html
    init {
        require(name.isNotBlank()) { "Name must not be blank." }
        require(downloads >= 0) { "Downloads must be non-negative." }
        require(rating in 1.0..5.0) { "AverageRating must be positive." }
        require(size > 0) { "Size must be positive." }
    }
}