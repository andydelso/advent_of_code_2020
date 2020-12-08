import day1.Day1Challenge
import org.junit.Test
import java.io.File

class Day1ChallengeTest {
    @Test fun checkSolution() {
        val day = Day1Challenge(File("/Users/1424448/dev/personal/advent_of_code/src/main/kotlin/Day1/input.txt"))
        print("${day.solve()}\n")
    }
}