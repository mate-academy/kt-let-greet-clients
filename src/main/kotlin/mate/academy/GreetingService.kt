package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = mutableListOf<String>()
        for (name in clientNames) {
            name?.let {
                greetings.add(it.greet())
            }
        }
        return greetings
    }

    private fun String.greet(): String = "Hello, ${this}!"
}
