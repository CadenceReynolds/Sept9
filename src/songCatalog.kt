fun main() {
    val song = songCatalog("War Pigs", "Jhone Benever", 1968, 1100)
    song.printDescription()
}

class songCatalog(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000


    fun printDescription() {
        println("$title, preformed by $artist, was released in $yearPublished years published")
    }
}