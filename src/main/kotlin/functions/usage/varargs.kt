package functions.usage

// You can mark a parameter of a function (usually the last one) with the vararg modifier:
fun <T> asList(vararg ts: T): List<T> {
  val result = ArrayList<T>()
  for (t in ts) // ts is an Array
    result.add(t)
  return result
}

