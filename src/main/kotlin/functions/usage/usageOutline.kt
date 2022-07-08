package functions.usage
import functions.declaration.*

fun main() {
  println("result1 is $result1")
  println("result2 is $result2")
  println("result3 is $result3")
  println("result4 is $result4")
  println("result5 is $result5")
  println("result6 is $result6")
  println("result7 is $result7")
  println("result8 is $result8")
  println("result9 is $result9")
  println("result10 is $result10")
}

//  Functions are called using the standard approach:
val result1 = double(2)

//Calling member functions uses dot notation:
val result2 = Stream().read(2)

// parameters.kt
val result3 = para1(4, 5)
val result4 = para2(4, 5)

// defaultArguments.kt
val result5 = tangerine(2)
val result6 = B().melon()
val result7 = banana(taste = 2, size = 6)

// namedArguments.kt

// unitReturningFunctions.kt
val result8 = printHello("")

// singleExpressionFunctions.kt
val result9 = watermelon(5)
val result10 = apple(5)