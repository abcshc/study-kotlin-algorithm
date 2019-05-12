class FindKim {
    companion object {
        fun solution(seoul: Array<String>): String {
            var answer = 0

            run loop@{
                seoul.forEachIndexed{ index, value ->
                    if(value.contains("Kim")) {
                        answer = index
                        return@forEachIndexed
                    }
                }
            }

            return "김서방은 ${answer}에 있다"
        }
    }
}