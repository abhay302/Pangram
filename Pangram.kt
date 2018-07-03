/**
 * isPangram() is an extension function which returns true if the given string is a pangram and returns false if the string is not a pangram
 */
fun  String.isPangram() : Boolean {

    /**
     *  A boolean array which indicates which alphabets have been found in the given string.
     *  Each index represents the corresponding alphabet
     */
    val arr= BooleanArray(26)

    /**
     * It counts the number of unique alphabets encountered so far
     */
    var count=0
    for(c in toCharArray()) {
        if(c.isLetter()) {
            val index = if(c.isLowerCase()) c.toInt() -97 else c.toInt() - 65

            // Checks whether the given alphabet is repeated
            if(!arr[index]) {
                count++
                arr[index]=true
            }
        }
        if(count==26) {
            return true
        }
    }
    return false
}


fun main(args: Array<String>) {
    print("The quick brown fox jumps over the lazy dog.".isPangram())
}