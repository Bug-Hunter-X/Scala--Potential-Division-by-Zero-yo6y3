```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) x // Correct handling of y == 0
    else x / y // Potential division by zero if y is 0
  }
}
```