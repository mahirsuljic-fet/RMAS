class Professor(
    var ime: String,
    var prezime: String,
    var predmet: String
) {
    fun ispis() {
        println("$prezime $ime $predmet")
    }
}

class Student1(
    var brojIndexa: Int,
    var ime: String,
    var prezime: String,
    var godinaStudija: Int
) {
    fun ispis() {
        println("$brojIndexa $prezime $ime $godinaStudija")
    }
}

open class MyParentClass {
    var x = 5

    open fun print() {
        println(x)
    }
}

open class MyChildClass : MyParentClass() {
    override fun print() {
        println("Child print -> $x")
    }
}

class Student(
    var ime: String = "Ime",
    var indeks: Int = 12345,
    var prosjek: Double = 10.0
) {
    override fun toString(): String {
        return "Student [$ime], indeks [$indeks], prosjek [$prosjek]"
    }
}

class Book(
    var title: String,
    var author: String,
    var price: Double
) {
    fun applyDiscount(discount: Double) {
        price -= discount / 100 * price
    }

    override fun toString(): String {
        return "Book [title: $title, author: $author, price: $price]"
    }
}

fun main() {
    val bookList = listOf(
        Book("Knjiga1", "Autor1", 10.0),
        Book("Knjiga2", "Autor2", 20.0),
        Book("Knjiga3", "Autor3", 30.0)
    )

    bookList.forEach { book ->
        book.applyDiscount(10.0);
        println(book)
    }
}

fun sabiranje(a: Int, b: Int): Int {
    return a + b;
}
