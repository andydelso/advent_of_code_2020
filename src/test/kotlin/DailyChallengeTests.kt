import day1.Day1Challenge
import day2.Day2Challenge
import day3.Day3Challenge
import org.junit.Test
import java.nio.file.Paths

class DailyChallengeTests {

    @Test fun checkSolution1() {
        val day = Day1Challenge(Paths.get("src/main/kotlin/day1/input.txt").toFile())
        print("\n\n*** DAY 1 ***\n")
        print("Part 1 = ${day.solvePart1()}\n")
        print("Part 2 = ${day.solvePart2()}\n\n")
    }

    @Test fun checkSolution2() {
        val day = Day2Challenge(Paths.get("src/main/kotlin/day2/input.txt").toFile())
        print("\n\n*** DAY 2 ***\n")
        print("Part 1 = ${day.solvePart1()}\n")
        print("Part 2 = ${day.solvePart2()}\n\n")
    }
    @Test fun checkSolution3() {
        val day = Day3Challenge(Paths.get("src/main/kotlin/day3/input.txt").toFile())
        print("\n\n*** DAY 3 ***\n")
        print("Part 1 = ${day.solvePart1()}\n")
        print("Part 2 = ${day.solvePart2()}\n\n")
    }
}
