package day1

import DailyChallenge
import java.io.File

/**
 * https://adventofcode.com/2020/day/1
 */
class Day1Challenge(private val file: File) : DailyChallenge {
    override fun solvePart1(): String {
        val lines = file.readLines()

        for (first in lines) {
            for (second in lines) {
                for (third in lines) {
                    if (first.toInt() + second.toInt() == 2020) {
                        return (first.toInt() * second.toInt()).toString()
                    }
                }
            }
        }

        return ""
    }

    override fun solvePart2(): Any {
        val lines = file.readLines()

        for (first in lines) {
            for (second in lines) {
                for (third in lines) {
                    if (first.toInt() + second.toInt() + third.toInt() == 2020) {
                        return (first.toInt() * second.toInt() * third.toInt()).toString()
                    }
                }
            }
        }

        return ""
    }
}
