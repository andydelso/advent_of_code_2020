import day1.Day1Challenge
import org.junit.Test
import java.io.File
import java.nio.file.Paths

class Day1ChallengeTest {
    private val path = Paths.get("src/main/kotlin/day1/input.txt")
    private val file = path.toFile()

    @Test fun checkSolution() {
        val day = Day1Challenge(file)
        print("\n\n*** DAY 1 ***\n")
        print("Part 1 = ${day.solvePart1()}\n")
        print("Part 2 = ${day.solvePart2()}\n\n")
    }
}
