import kotlin.math.abs

class AlgorithmWarmUp {

    companion object {
        fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
            val aScore = mutableListOf<Int>()
            val bScore = mutableListOf<Int>()
            (a zip b).forEach {
                aScore.add(it.first.compareTo(it.second))
                bScore.add(it.second.compareTo(it.first))
            }

            return arrayOf(aScore.fold(0, { currentAValue, element ->
                determineValue(currentAValue, element)
            }), bScore.fold(0, { currentBValue, bElement -> determineValue(currentBValue, bElement) }))
        }

        private fun determineValue(accumulatorValue: Int, element: Int): Int {
            return if (element > 0) accumulatorValue + 1 else accumulatorValue + 0
        }

        fun aVeryBigSum(ar: Array<Long>): Long {
            return ar.fold(0L, { currentValue, element -> currentValue + element }).toLong()
        }

        fun diagonalDifference(arr: Array<Array<Int>>): Int {
            val droppedArray = arr.drop(1)
            var primaryDiagonal = 0
            var secondaryDiagonal = 0
            primaryDiagonal += droppedArray.indices.sumBy { index ->
                println("Index: $index")
                println("primaryDiagonal: $primaryDiagonal")
                return@sumBy droppedArray[index][index]
            }

            secondaryDiagonal += droppedArray.indices.sumBy { index ->
                val endIndex = (droppedArray[index].count() - 1) - index
                println("End index: $endIndex")
                println("secondaryDiagonal: $secondaryDiagonal")

                return@sumBy droppedArray[index][endIndex]
            }
            return abs(primaryDiagonal - secondaryDiagonal)
        }

        fun staircase(n: Int):String {
            val output = mutableListOf<String>()
            (1..n).forEach {
                output.add(" ".repeat(n-it) + "#".repeat(it))
            }
            return output.joinToString(separator = "")
        }

        fun miniMaxSum(arr: Array<Int>): Array<Int> {
           val total = arr.sum()

            return arrayOf(total-arr.maxOrNull()!!,total-arr.minOrNull()!!)
        }

        fun fizzBuzz(n: Int): List<String> {
            val result = mutableListOf<String>()
            (1..n).forEach {
                if (it.rem(5) == 0 && it.rem(3) == 0)
                    result.add("FizzBuzz")
                else if (it.rem(5) == 0)
                    result.add("Buzz")
                else if (it.rem(3) == 0)
                    result.add("Fizz")
                if (it.rem(5) != 0 && it.rem(3) != 0)
                    result.add("$it")
            }
            return result
        }

    }

}