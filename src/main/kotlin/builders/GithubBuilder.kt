package builders

class GithubBuilder : ProfileBuilder() {

    override fun getUrl(user: String): String {
        return "http://www.github.com/$user"
    }
}