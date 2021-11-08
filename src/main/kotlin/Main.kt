import builders.GetBuilder

fun main(args: Array<String>) {

    val facebookBuilder = GetBuilder.forSite("facebook")
    val githubBuilder = GetBuilder.forSite("github")

    val facebookLink = GetLink(facebookBuilder).getLink("luciano-kelvin")
    val githubLink = GetLink(githubBuilder).getLink("luciano-kelvin")

    println(facebookLink)
    println(githubLink)


}
