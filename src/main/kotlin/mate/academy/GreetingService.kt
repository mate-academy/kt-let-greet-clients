package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        return clientNames.mapNotNull { name ->
            name?.let { greeting(it) }
        }
    }

    private fun greeting(name: String): String = "Hello, $name!"
}
