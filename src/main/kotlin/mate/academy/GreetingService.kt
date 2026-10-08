package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val result = mutableListOf<String>()
        for (name in clientNames) {
            name?.let { nonNullName ->
                result.add("Hello, $nonNullName!")
            }
        }
        return result
    }
}
