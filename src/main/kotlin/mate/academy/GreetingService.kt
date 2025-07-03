package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val client = mutableListOf<String>()
        for (clientName in clientNames) {
            if (clientName != null) {
                client.add("Hello, $clientName!")
            }
        }
        client?.let {
            return it
        }
        return client
    }
}
