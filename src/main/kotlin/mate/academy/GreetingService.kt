package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val result = mutableListOf<String>()
        clientNames.forEach {
            if (it != null) {
                result.add("Hello, $it!")
            }
        }
        return result
    }
}
