/**
 * isPangram() is an extension function which returns true if the given string is a pangram and returns false if the string is not a pangram
 */
fun  String.isPangram() = filter { it.isLetter() }.map { it.toLowerCase() }.toSet().size == 26

fun main(args: Array<String>) {
    print("The quick brown fox jumps over the lazy dog.".isPangram())
}
