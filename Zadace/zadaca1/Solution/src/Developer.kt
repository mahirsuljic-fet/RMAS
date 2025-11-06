class Developer (
    val name: String,
    val county: String,
    val appList: MutableList<Application>
) {
    init {
        require(name.isNotBlank()) { "Name must not be blank." }
        require(county.isNotBlank()) { "County must not be blank." }
    }
}
