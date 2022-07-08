package functions.usage

// A default value is defined using = after the type.
fun tangerine(
  color: Int,
  taste: Int = 8,
  size: Int = 4,
): Int {
  return taste / size + color
}



/* Overriding methods always use the same default parameter values as the base method.
When overriding a method that has default parameter values,
the default parameter values must be omitted from the signature:*/
open class A {
  open fun melon(i: Int = 10): Int {
    return 2 * i
  }
}

class B : A() {
  override fun melon(i: Int): Int {
    return 2 * i
  }  // No default value is allowed.
}



/* If a default parameter precedes a parameter with no default value,
the default value can only be used by calling the function with named arguments: */
fun banana(
  color: Int = 4,
  taste: Int,
  size: Int,
): Int {
  return color + taste + size
}



/* If the last argument after default parameters is a lambda,
you can pass it either as a named argument or outside the parentheses: */
fun cookie(
  p: Int = 2,
  q: Int = 10,
  z: () -> Unit,
): Int {
  return p + q
}

val a = cookie(1) { println("hello") }
// Uses the default value q = 10
val b = cookie(z = { println("hello") })
// Uses both default values p = 2 and q = 10
val c = cookie { println("hello") }
// Uses both default values p = 2 and q = 10