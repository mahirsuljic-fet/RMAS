// Data taken from Google Play Store
val appList = listOf<Application>(
    Application(
        "ChatGPT",
        Category.Productivity,
        500_000_000,
        4.6,
        23.08
    ),

    Application(
        "Temu",
        Category.Shopping,
        500_000_000,
        4.5,
        67.0
    ),

    Application(
        "WhatsApp",
        Category.Communication,
        10_000_000_000,
        4.3,
        48.02
    ),

    Application(
        "Samsung Smart Switch Mobile",
        Category.Tools,
        1_000_000_000,
        4.2,
        81.53
    ),

    Application(
        "Instagram",
        Category.Social,
        5_000_000_000,
        4.3,
        99.26
    ),

    Application(
        "Microsoft Teams",
        Category.Business,
        500_000_000,
        4.6,
        61.74
    ),

    Application(
        "Duolingo",
        Category.Education,
        500_000_000,
        4.6,
        108.0
    ),

    Application(
        "Raiffeisen Mobile Banking",
        Category.Finance,
        100_000,
        4.7,
        183.0
    ),

    Application(
        "Netflix",
        Category.Entertainment,
        1_000_000_000,
        3.8,
        4.32
    ),

    Application(
        "8 Ball Pool",
        Category.Games,
        1_000_000_000,
        4.8,
        104.0
    ),

    Application(
        "LifestyleApp1",
        Category.Lifestyle,
        100_000,
        2.0,
        100.0
    ),

    Application(
        "LifestyleApp2",
        Category.Lifestyle,
        200_000,
        4.0,
        300.0
    )
)

val devList = listOf<Developer>(
    Developer(
        "Developer1",
        "BiH",
        appList.take(appList.size / 2).toMutableList()
    ),

    Developer(
        "Developer2",
        "BiH",
        appList.drop(appList.size / 2).toMutableList()
    )
)

val provjeraTestData = listOf<Application>(
    Application(
        "App1",
        Category.Productivity,
        10,
        5.0,
        10.0
    ),

    Application(
        "App2",
        Category.Productivity,
        20,
        4.0,
        10.0
    ),

    Application(
        "App3",
        Category.Communication,
        10,
        3.0,
        10.0
    ),

    Application(
        "App4",
        Category.Communication,
        20,
        2.0,
        10.0
    )
)