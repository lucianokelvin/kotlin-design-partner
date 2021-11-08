package builders

class TwitterBuilder : ProfileBuilder() {

    override fun getUrl(user: String): String {
        return "http://www.twitter.com/$user"
    }
}