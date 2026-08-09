package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        return clientNames.mapNotNull{it?.let{name -> "Hello, $name!"}}.toList()
    }
}
