package functions.usage

fun reformat(
  str: String,
  normalizeCase: Boolean = true,
  upperCaseFirstLetter: Boolean = true,
  divideByCamelHumps: Boolean = false,
  wordSeparator: Char = ' ',
) { /*...*/ }


// When calling this function, you don’t have to name all its arguments:
val callingFunction = reformat(
"String!",
false,
upperCaseFirstLetter = false,
divideByCamelHumps = true,
'_'
)

// You can skip all the ones with default values:
val callingFunction2 = reformat("This is a long String!")

/* You are also able to skip specific arguments with default values,
rather than omitting them all.
However, after the first skipped argument,
you must name all subsequent arguments: */
val callingFunction3 = reformat("This is a short String!", upperCaseFirstLetter = false, wordSeparator = '_')

// You can pass a variable number of arguments (vararg) with names using the spread operator:
