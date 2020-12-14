import day2.Day2Challenge
import org.junit.Test
import java.nio.file.Paths

class Day2ChallengeTest {
    private val path = Paths.get("src/main/kotlin/day2/input.txt")
    private val file = path.toFile()

    @Test fun checkSolution() {
        val day = Day2Challenge(file)
        print("\n\n*** DAY 2 ***\n")
        print("Part 1 = ${day.solvePart1()}\n")
        print("Part 2 = ${day.solvePart2()}\n\n")
    }
}
