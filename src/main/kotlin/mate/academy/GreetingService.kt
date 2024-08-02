package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val personalGreetings = mutableListOf<String>()
        clientNames.forEach {
            it?.let {
                personalGreetings.add("Hello, $it!")
            }
        }
        return personalGreetings
    }
}
