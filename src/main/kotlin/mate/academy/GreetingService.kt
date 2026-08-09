package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val list = mutableListOf<String>()

        for (element in clientNames) {
            val name = element
            name?.let { list.add("Hello, ${it}!") }
        }

        return list
    }
}
