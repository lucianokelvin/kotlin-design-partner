package builders

abstract class ProfileBuilder() {

    abstract fun getUrl(user: String): String

}