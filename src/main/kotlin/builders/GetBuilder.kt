package builders

class GetBuilder {

    companion object {
        fun forSite(site: String): ProfileBuilder {
            return when (site) {
                "facebook" -> FacebookBuilder()
                "twitter" -> TwitterBuilder()
                "github" -> GithubBuilder()
                else -> throw IllegalArgumentException("Site dont supported")
            }
        }
    }
}