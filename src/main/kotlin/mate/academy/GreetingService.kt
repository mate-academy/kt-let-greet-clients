package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val result = mutableListOf<String>()
        clientNames.forEach {
            it.let { result.add("Hello, $it!") }
        }
        return result
    }
}
