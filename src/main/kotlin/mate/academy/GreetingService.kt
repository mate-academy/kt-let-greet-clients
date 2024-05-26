package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>) = clientNames.mapNotNull { name-> name?.let{"Hello, $it!"} }
}
