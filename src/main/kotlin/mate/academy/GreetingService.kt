package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        return clientNames.let {
            it.filterNotNull()
                .filter { it.isNotEmpty() }
                .map { "Hello, $it!" }
        }
    }
}
