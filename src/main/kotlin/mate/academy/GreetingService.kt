package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val names = mutableListOf<String>()
        for (clientName in clientNames) {
            clientName?.let {
                names.add("Hello, $clientName!")
            }
        }
        return names
    }
}
