package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = mutableListOf<String>()

        for (name in clientNames) {
            name?.let { clientName ->
                greetings.add("Hello, $clientName!")
            }
        }

        return greetings
    }
}
