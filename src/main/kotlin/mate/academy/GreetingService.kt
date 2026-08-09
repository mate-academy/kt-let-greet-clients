package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings = arrayListOf<String>()
        clientNames.let {
            for (name in clientNames) {
                if (name != null) {
                    greetings.add("Hello, ${name}!")
                }
            }
        }
        return greetings
    }
}
