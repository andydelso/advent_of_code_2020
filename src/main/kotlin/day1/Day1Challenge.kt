package day1

import DailyChallenge
import java.io.File

/**
 * https://adventofcode.com/2020/day/1
 */
class Day1Challenge(private val file: File) : DailyChallenge {
    override fun solve(): String? {
        val lines = file.readLines()

        // TODO: how can we improve this? Use lambdas? Can we make this address both cases of the problem?
        for (first in lines) {
            for (second in lines) {
                for (third in lines) {
                    if (first.toInt() + second.toInt() + third.toInt() == 2020) {
                        return (first.toInt() * second.toInt() * third.toInt()).toString()
                    }
                }
            }
        }

        return null
    }
}
