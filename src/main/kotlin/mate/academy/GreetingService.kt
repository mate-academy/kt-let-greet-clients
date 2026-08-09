package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = mutableListOf<String>()
        for (clientName in clientNames) {
            clientName?.let { name ->
                greetings.add("Hello, $name!")
            }
        }
        return greetings
    }
}
