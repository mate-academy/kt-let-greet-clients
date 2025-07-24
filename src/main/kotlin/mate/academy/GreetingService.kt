package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetings : MutableList<String> = mutableListOf();
        for (client in clientNames) {
            client.let{
                if (it != null) {
                    greetings.add("Hello, $it!")
                }
            }
        }
        return greetings
    }
}
