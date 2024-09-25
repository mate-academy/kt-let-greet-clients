package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val list: MutableList<String> = mutableListOf()
        clientNames?.map { it?.let { list.add("Hello, $it!") }
        }
        return list
    }
}
