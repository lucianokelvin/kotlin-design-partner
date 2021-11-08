package builders

class FacebookBuilder : ProfileBuilder() {

    override fun getUrl(user: String): String {
        return "http://www.facebook.com.br/$user"
    }
}