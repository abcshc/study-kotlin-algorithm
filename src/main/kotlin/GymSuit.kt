class GymSuit {
    companion object {
        fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
            var reserveIndex = 0
            var unhappyFriends = 0
            var sortedReserve = reserve.sortedArray()
            var lender = ArrayList<Int>()
            lost.sortedArray().forEach {
                if (reserveIndex == sortedReserve.size)
                    unhappyFriends++
                reserve@ for (i in reserveIndex until sortedReserve.size) {
                    if (lender.contains(it)) {
                        unhappyFriends++
                        break@reserve
                    }
                    if (sortedReserve[reserveIndex] == it){
                        reserveIndex++
                        break@reserve
                    }
                    if (sortedReserve[i] < it - 1)
                        reserveIndex++
                    if (sortedReserve[i] == it - 1) {
                        reserveIndex++
                        break@reserve
                    }
                    if (sortedReserve[i] == it + 1) {
                        lender.add(sortedReserve[i])
                        reserveIndex++
                        break@reserve
                    }
                    if (sortedReserve[i] > it + 1 || i == reserve.size - 1) {
                        unhappyFriends++
                        break@reserve
                    }
                }
            }
            return n - unhappyFriends
        }
    }
}