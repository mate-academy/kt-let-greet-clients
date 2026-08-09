package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val resultGreetings: MutableList<String> = mutableListOf()
        clientNames.forEach(){
            it?.let {
                resultGreetings.add("Hello, ${it}!")
            }
        }
        return resultGreetings
    }
}
