package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val resultArray = arrayListOf<String>()

        clientNames.forEach {it?.let { resultArray.add("Hello, $it!") }}

        return resultArray
    }
}
