package factory

import products.Button
import products.LinuxButton
import products.LinuxWindow
import products.Window

class LinuxFactory : GUIFactory() {

    override fun createButton(): Button {
        return LinuxButton()
    }

    override fun createWindow(): Window {
        return LinuxWindow()
    }
}