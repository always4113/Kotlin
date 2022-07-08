package functions.usage

/* If a function does not return a useful value,
its return type is Unit.
Unit is a type with only one value - Unit.
This value does not have to be returned explicitly: */
fun printHello(name: String?): Unit {
  if (name != null)
    println("Hello $name")
  else
    println("Hi there!")
  // `return Unit` or `return` is optional
}

/* The Unit return type declaration is also optional.
The above code is equivalent to: */
fun printHello2(name: String?) {
// codes
}