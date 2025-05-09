package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val listOfNames = mutableListOf<String>()
        clientNames.forEach {
            it?.let {
                listOfNames.add("Hello, $it!")
            }
        }
        return listOfNames
    }
}
