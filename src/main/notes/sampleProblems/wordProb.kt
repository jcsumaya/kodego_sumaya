package sampleProblems
//All the letters of the English alphabet are divided into vowels and consonants.
//The vowels are: a, e, i, o, u, y.
//The remaining letters are consonants.
//A word is considered euphonious if it doesn't have three or more vowels or consonants in a row. Otherwise, it is considered discordant.
//Your task is to create euphonious words from the discordant ones. You can insert any letters inside the word.
// Output the minimum number of characters needed to create a euphonious word from a given word.
//For example, the word "schedule" is considered discordant because it has three consonants in a row: "sch".
// To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
fun main() {
    var input = readln()
    var vowel = "aeiouy"
    var counter = 0
    var vowelCount = 0
    var consonantCount = 0
    for (letter in input) {
        if (letter in vowel) {
            vowelCount++
            consonantCount = 0
        } else{
            consonantCount++
            vowelCount = 0
        }
        if (vowelCount >= 3 || consonantCount >= 3) {
            counter++
            consonantCount = 1
            vowelCount = 1
        }
    }
    print(counter)
}