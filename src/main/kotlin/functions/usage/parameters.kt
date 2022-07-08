package functions.usage

/* Function parameters are defined using Pascal notation - name: type.
Parameters are separated using commas,
and each parameter must be explicitly typed: */
fun para1(number: Int, exponent: Int): Int {
  return number + exponent
}

// You can use a trailing comma when you declare function parameters:
fun para2(
  number2: Int,
  exponent2: Int, // trailing comma
): Int {
  return number2 + exponent2
}