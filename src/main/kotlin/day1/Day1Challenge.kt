package day1

import DailyChallenge
import java.io.File

class Day1Challenge(private val file: File) : DailyChallenge {
    override fun solve(): String? {
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

        return null
    }
}