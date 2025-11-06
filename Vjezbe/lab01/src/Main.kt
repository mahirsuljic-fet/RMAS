fun main() {
    z3()
}


//////////////
// PRIMJERI //
//////////////

// Varijable
fun p1() {
    val name1 = "Mahir"
    println(name1)

    val name2: String = "Mahir"
    println(name2)

    val a = 5
    println(a)

    val b = 7
    println(b)

    println(name1[1])
    println("Moje ime je $name1")
    println("$a + $b = ${a + b}")
}

// Tipovi
fun p2() {
    val isClicked: Boolean = true
    val a: Char = 'B'
    // val let2 : Char = 66 // - error
}

// String
fun p3() {
    val text1: String = "Hello World!"
    val text2: String = "Hello World"
    println(text1.compareTo(text2))
    println(text2.compareTo(text1))

    val text3: String = "Danas imamo druge lab vježbe."
    println(text3.indexOf("druge"))

    println("$text1 $text3")
}

// if
fun p4() {
    val a = 5
    val b = 10

    if (a < b)
        println("$a je manje od $b")
    else if (a > b)
        println("$a je veće od $b")
    else
        println("$a je jednako od $b")
}

// when
fun p5() {
    val day = 4

    val result = when (day) {
        1 -> "ponedjeljak"
        2 -> "utorak"
        3 -> "srijeda"
        4 -> "četvrtak"
        5 -> "petak"
        6 -> "subota"
        7 -> "nedjelja"
        else -> "nepoznat"
    }

    println(result)
}

// for petlja i nizovi
fun p6() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    for (x in nums)
        println(x)

    val cars = arrayOf("Peugeot", "Opel", "Golf", "BMW")
    val car = "Peugeot"

    if (car in cars)
        println("$car je u nizu")
    else
        println("$car nije u nizu")

    println(cars[0])
    println("Niz ima ${cars.size} auta")
}


////////////
// ZADACI //
////////////

// Zadatak 1
fun z1() {
    val ime: String = "Mahir";
    val godinaStudija: Int = 4;
    val smijer: String = "RI";

    println("Dobrodošao $ime! Ti si student $godinaStudija. godine na smijeru $smijer.")
}

// Zadatak2
fun z2() {
    val ocjena = 8;

    val poruka = when (ocjena) {
        6 -> "Student nije položio ispit"
        7, 8 -> "Student je položio ispit"
        9, 10 -> "Odličan uspjeh"
        else -> "Ocjena nije validna"
    }

    println(poruka)

    if (ocjena == 6) println("Student nije položio ispit")
    else if (ocjena in 7..8) println("Student je položio ispit")
    else if (ocjena in 9..10) println("Odličan uspjeh")
    else println("Ocjena nije validna")
}

// Zadatak 3
fun z3() {
    val brojStudenata = 10

    var i = 1
    while (i <= brojStudenata)
        println("Student ${i++} je prisutan")

    println("Svi studenti su evidentirani")
}