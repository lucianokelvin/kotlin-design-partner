package factory

import products.Button
import products.Window

abstract class GUIFactory {

    abstract fun createButton(): Button

    abstract fun createWindow(): Window
}