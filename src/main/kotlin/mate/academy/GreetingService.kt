package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = arrayListOf<String>()
        clientNames.forEach {
            it?.let {
                greetings.add("Hello, $it!")
            }
        }
        return greetings
    }
}
