//////////////
/// FILTER ///
//////////////
fun customFilterByRatingAbove(appList: List<Application>, rating: Double): List<Application> {
    val filteredList = mutableListOf<Application>()

    for (app in appList) {
        if (app.rating >= rating) {
            filteredList.add(app)
        }
    }

    return filteredList
}

fun filterBy(appList: List<Application>, lambda: (Application) -> Boolean): List<Application> {
    return appList.filter(lambda)
}

////////////////
/// GROUPING ///
////////////////
fun customGroupByCategory(appList: List<Application>): Map<Category, Int> {
    val result = mutableMapOf<Category, Int>()

    for (app in appList) {
        result[app.category] = result.getOrDefault(app.category, 0) + 1
    }

    return result
}

fun groupByCategory(appList: List<Application>): Map<Category, Int> {
    return appList.groupingBy { it.category }.eachCount()
}

///////////////
/// SORTING ///
///////////////
fun customSortByDownloadsDesc(appList: List<Application>): List<Application> {
    var sorted = false
    val result = appList.toMutableList()

    // bubble sort
    while (!sorted) {
        sorted = true
        for ((i, app) in result.withIndex()) {
            if (i + 1 >= result.size) break

            if (result[i + 1].downloads > app.downloads) {
                val temp = result[i]
                result[i] = result[i + 1]
                result[i + 1] = temp
                sorted = false
            }
        }
    }

    return result
}

fun sortByDownloadsDesc(appList: List<Application>): List<Application> {
    return appList.sortedByDescending { it.downloads }
}

////////////////////
/// AVERAGE SIZE ///
////////////////////
fun averageSizeByCategory(appList: List<Application>): Map<Category, Double> {
    val foldInit = mapOf<Category, Pair<Double, Int>>()

    val foldFunc =
        fun(map: Map<Category, Pair<Double, Int>>, app: Application): Map<Category, Pair<Double, Int>> {
            val prevValue = map.getOrDefault(app.category, Pair(0.0, 0))
            val newValue = Pair(prevValue.first + app.size, prevValue.second + 1)
            return map + (app.category to newValue)
        }

    return appList.fold(foldInit, foldFunc).mapValues { it.value.first / it.value.second }
}

////////////
/// FIND ///
////////////
fun findByName(appList: List<Application>, name: String): Application? {
    return appList.find { it.name.equals(name, true) }
}

fun findByNameAndPrint(appList: List<Application>, name: String): Unit {
    when (val app = findByName(appList, name)) {
        null -> println("App not found")
        else -> println(app)
    }
}

/////////////
/// PRINT ///
/////////////
fun compactifyNumber(number: Long): String {
    val formatPairs = listOf(
        Pair(1_000_000_000, "B+"),
        Pair(1_000_000, "M+"),
        Pair(100_000, "00k+"),
        Pair(1_000, "000+")
    )

    for (format in formatPairs) {
        if (number >= format.first) {
            return (number / format.first).toString() + format.second
        }
    }

    return number.toString();
}

// App: MindSpace | Category: Productivity | Rating: 4.8 | Downloads: 1M+ | Size: 35MB
fun prettyFormat(app: Application): String {
    val downloads: String = compactifyNumber(app.downloads)
    return "App: ${app.name} | Category: ${app.category} | Rating: ${app.rating} | Downloads: $downloads | Size: ${app.size}"
}

fun prettyPrint(appList: List<Application>): Unit {
    appList.map { app -> prettyFormat(app) }.forEach(::println)
}

/////////////////
/// DEVELOPER ///
/////////////////
fun findDeveloperWithMostDownloads(devList: List<Developer>): Developer {
    return devList
        .map { Pair(it, it.appList.sumOf { application -> application.downloads }) }
        .maxBy { it.second }
        .first
}

fun getAverageRating(developer: Developer): Double {
    return developer.appList.sumOf { application -> application.rating } / developer.appList.size
}

////////////////
/// PROVJERA ///
////////////////
fun weightedRatingByCategory(appList: List<Application>): Map<Category, Double> {
    val map = mutableMapOf<Category, Pair<Double, Long>>()

    for (app in appList) {
        val prevValue = map.getOrDefault(app.category, Pair(0.0, 0))
        val newValue = Pair(prevValue.first + app.rating * app.downloads, prevValue.second + app.downloads)
        map[app.category] = newValue
    }

    return map.mapValues { it.value.first / it.value.second }
}

fun getMaxWeightedRating(appList: List<Application>): Category {
    return weightedRatingByCategory(appList).maxBy { it.value }.key
}