import builders.ProfileBuilder

class GetLink(private val builder: ProfileBuilder) {

    fun getLink(user: String): String {
        return builder.getUrl(user)
    }

}