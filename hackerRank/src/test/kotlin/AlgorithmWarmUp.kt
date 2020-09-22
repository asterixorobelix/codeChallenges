class AlgorithmWarmUp {

    companion object {
        fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
            var aScore = mutableListOf<Int>()
            var bScore = mutableListOf<Int>()
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
            return  ar.fold(0L,{currentValue, element -> currentValue+element}).toLong()
        }

        fun diagonalDifference(arr: Array<Array<Int>>): Int {
            return 1
        }

    }

}