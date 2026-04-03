package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val result = mutableListOf<String>()
        for (name in clientNames) {
            name?.let {
                result.add("Hello, $it!")
            }
        }
        return result
    }
}
