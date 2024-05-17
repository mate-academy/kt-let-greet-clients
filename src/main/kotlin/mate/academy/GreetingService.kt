package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        // TODO: implement it
        return clientNames.mapNotNull { name ->
            name?.let { "Hello, $it!" }
        }
    }
}
