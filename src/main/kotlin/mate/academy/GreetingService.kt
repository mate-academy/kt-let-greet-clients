package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val result = mutableListOf<String>()

        for (name in clientNames) {
            // let виконається тільки якщо name не null
            name?.let {
                result.add("Hello, $it!")
            }
        }

        return result
    }
}
