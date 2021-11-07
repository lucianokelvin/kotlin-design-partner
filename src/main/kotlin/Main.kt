import factory.GUIFactory
import factory.LinuxFactory
import factory.WindowsFactory


fun main(args: Array<String>) {
    val guiFactory: GUIFactory = getFactoryFor("Linux")

    val window = guiFactory.createWindow()
    val button = guiFactory.createButton()

    window.draw()
    button.draw()
}

fun getFactoryFor(so: String): GUIFactory {
    return when (so.uppercase()) {
        "WINDOWS" -> WindowsFactory()
        "LINUX" -> LinuxFactory()
        else -> throw IllegalArgumentException("SO do not supported")
    }
}
