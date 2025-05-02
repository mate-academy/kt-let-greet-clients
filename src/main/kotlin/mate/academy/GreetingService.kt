package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetingsList = mutableListOf<String>()
        clientNames.forEach {
            it?.let { name -> greetingsList.add("Hello, $name!") }
        }
        return greetingsList
    }
}
