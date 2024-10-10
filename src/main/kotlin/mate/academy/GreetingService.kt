package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val resultGreetings: MutableList<String> = mutableListOf()
        clientNames.forEach(){
            name -> name?.let {
                resultGreetings.add("Hello, ${it}!")
            }
        }
        return resultGreetings
    }
}
