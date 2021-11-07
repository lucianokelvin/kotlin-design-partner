package factory

import products.Button
import products.Window
import products.WindowsButton
import products.WindowsWindow

class WindowsFactory : GUIFactory() {

    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createWindow(): Window {
        return WindowsWindow()
    }
}