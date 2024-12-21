```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) {
      0 // Handle division by zero. You might choose to throw an exception or return a different default value
    } else {
      x / y
    }
  }
}
```