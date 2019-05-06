class GymSuit {
    companion object {
        fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
            var reserveIndex = 0
            var unhappyFriends = 0

            var validReserveList = reserve.sortedArray().filter { !lost.contains(it) }
            var validLostList = lost.sortedArray().filter { !reserve.contains(it) }

            validLostList.forEach {
                var borrow = false
                reserve@ for (i in reserveIndex until validReserveList.size) {
                    if (validReserveList[i] < it - 1) {
                        reserveIndex++
                        continue@reserve
                    }
                    if (validReserveList[i] == it - 1 || validReserveList[i] == it + 1) {
                        reserveIndex++
                        borrow = true
                        break@reserve
                    }
                }
                if (!borrow)
                    unhappyFriends++
            }
            return n - unhappyFriends
        }
    }
}