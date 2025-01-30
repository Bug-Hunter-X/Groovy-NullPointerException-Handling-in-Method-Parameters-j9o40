```groovy
def foo(a, b) {
  if (a == null || b == null) {
    return 0 // Or throw a custom exception: throw new IllegalArgumentException("Parameters cannot be null")
  }
  return a + b
}

println foo(1,2)
println foo(null,2)
println foo(1,null)
println foo(null,null) 
```