package mate.academy

private const val GREETING_TEMPLATE = "Hello, %s!"

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = mutableListOf<String>()

        clientNames.forEach { name ->
            name?.let {
                greetings.add(GREETING_TEMPLATE.format(it))
            }
        }

        return greetings
    }
}
