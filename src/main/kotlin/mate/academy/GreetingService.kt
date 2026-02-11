package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = mutableListOf<String>()
        clientNames.map {
            it?.let { greetings.add( "Hello, $it!") }
        }
        return greetings
    }
}
