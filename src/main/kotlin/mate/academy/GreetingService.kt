package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val res = mutableListOf<String>()
        clientNames.forEach {
            it?.let {
                res.add("Hello, $it!")
            }
        }
        return res
    }
}
