package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val list: MutableList<String> = mutableListOf()
        clientNames.let {
            for (i in clientNames) {
                if (i != null) {
                    list.add("Hello, $i!")
                }
            }
        }
        return list
    }
}
