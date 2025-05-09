package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {

        val mutableList: MutableList<String> = mutableListOf()

        for (name in clientNames) {
            name?.let {
                mutableList.add(greeting(it))
            }
        }
        return mutableList
    }

    private fun greeting(name: String): String {
        return "Hello, $name!"
    }
}
