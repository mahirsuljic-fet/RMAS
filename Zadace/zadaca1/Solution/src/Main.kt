fun main() {
//    filterTests()
//    groupTests()
//    findTests()
//    constructorTests()
//    developerTests()
//
//    println("\nAll tests passed!")

    println(getMaxWeightedRating(provjeraTestData))
}

fun filterTests() {
    val limit = 4.5
    val expected = 6

    check(customFilterByRatingAbove(appList, limit).count() == expected)
    check(filterBy(appList, { app -> app.rating >= limit }).count() == expected)

    println("Filter tests passed.")
}

fun groupTests() {
    val expected = 11

    check(customGroupByCategory(appList).count() == expected)
    check(groupByCategory(appList).count() == expected)

    println("Group tests passed.")
}

fun findTests() {
    check(findByName(appList, "Netflix") != null)
    check(findByName(appList, "netflix") != null)
    check(findByName(appList, "Netfli") == null)

    println("Find tests passed.")
}

fun constructorTests() {
    val valid = Application("App", Category.Education, 1_000_000, 5.0, 100.0)
    var thrown = false

    // name test
    try {
        Application("", valid.category, valid.downloads, valid.rating, valid.size)
    } catch (_: Exception) {
        thrown = true
    }

    check(thrown)
    thrown = false

    // downloads test
    try {
        Application(valid.name, valid.category, -1, valid.rating, valid.size)
    } catch (_: Exception) {
        thrown = true
    }

    check(thrown)
    thrown = false

    // rating test
    try {
        Application(valid.name, valid.category, valid.downloads, 0.0, valid.size)
    } catch (_: Exception) {
        thrown = true
    }

    check(thrown)
    thrown = false

    // size test
    try {
        Application(valid.name, valid.category, valid.downloads, valid.rating, 0.0)
    } catch (_: Exception) {
        thrown = true
    }

    check(thrown)

    println("Constructor tests passed.")
}

fun developerTests() {
    check(findDeveloperWithMostDownloads(devList) == devList[0])
    check(getAverageRating(devList.first()) == (4.0 + 5.0 / 12.0))

    println("Developer tests passed.")
}