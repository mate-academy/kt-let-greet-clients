package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val list: ArrayList<String> = ArrayList()
        for (element in clientNames) {
            element?.let { list.add("Hello, $it!") }
        }
        return list
    }
}
