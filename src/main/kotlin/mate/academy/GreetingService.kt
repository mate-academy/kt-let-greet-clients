package mate.academy

class GreetingService {
    companion object {
        const val MESSAGE = "Hello, %s!"
    }
    fun getGreetings(clientNames: List<String?>): List<String> {
        val result : MutableList<String> = mutableListOf()
        clientNames.forEach {
            it?.let {
                result.add(MESSAGE.format(it))
            }
        }
        return result
    }
}
