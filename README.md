# Singleton

Singleton is a creational design pattern that allows you to ensure that a class has only one instance, while providing a
global access point for that instance.

### In Kotlin

To use the Singleton partner in Kotlin we need (1) define a private constructor to avoid the developer from
instantiating the object directly elsewhere. After that we (2) create a function to always return the same object
instance. (3) For Thread-Safe we use the annotation @Synchronized to avoid two threads call the _getInstance_ function
on the same moment.
