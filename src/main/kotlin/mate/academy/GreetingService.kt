package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greetingList : MutableList<String> = mutableListOf()
        clientNames.forEach { it?.let { greetingList.add("Hello, $it!") } }
        return greetingList
    }
}
