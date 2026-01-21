package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = mutableListOf<String>()

        for (name in clientNames) {
            name?.let {
                greetings.add("Hello, $it!")
            }
        }

        return greetings
    }
}
