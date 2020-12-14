package day2

import DailyChallenge
import java.io.File

/**
 * From: https://adventofcode.com/2020/day/2
 */
class Day2Challenge(private val file: File) : DailyChallenge {

    /**
     * Part 1
     */
    override fun solvePart1(): Int {
        var totalValid = 0
        val lines = file.readLines()

        lines.forEach {

            var (range, letter, password) = it.split(" ")
            var count = countLetterInLine(letter, password)
            totalValid += totalIfWithinRange(count, range)
        }

        return totalValid
    }

    private fun countLetterInLine(expected: String, line: String): Int {
        var count = 0

        line.forEach {
            var character = expected.replace(":", "").elementAt(0)
            if (it == character) {
                count++
            }
        }

        return count
    }

    private fun totalIfWithinRange(count: Int, range: String): Int {
        var total = 0
        var (rangeStart, rangeEnd) = range.split("-")

        if (count in rangeStart.toInt()..rangeEnd.toInt()) {
            total++
        }

        return total
    }

    /**
     * Part 2
     */
    override fun solvePart2(): Int {
        var totalValid = 0
        val lines = file.readLines()

        lines.forEach {
            var (range, letter, password) = it.split(" ")
            if (letterIsInPosition(range, letter, password)) {
                totalValid++
            }
        }

        return totalValid
    }

    private fun letterIsInPosition(range: String, letter: String, password: String): Boolean {
        var (firstPosition, secondPosition) = range.split("-")
        val firstPositionInt = firstPosition.toInt()
        val secondPositionInt = secondPosition.toInt()
        val onlyLetter = letter.replace(":", "")

        return positionIsLetter(firstPositionInt, onlyLetter, password).xor(positionIsLetter(secondPositionInt, onlyLetter, password))
    }

    private fun positionIsLetter(position: Int, expected: String, password: String): Boolean {
        val actual = password[position - 1].toString()
        return actual == expected
    }
}
