package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        var result: ArrayList<String> = ArrayList()
        for (name in clientNames) {
            name?.let {
                result.add("Hello, $name!")
            }
        }
        return result
    }
}
