class Soobak {
    companion object {
        fun solution(n: Int): String {
            var answer = ""
            for (i in 0..(n / 2 + 1)) {
                answer += "수박"
            }
            return answer.substring(0 until n)
        }
    }
}