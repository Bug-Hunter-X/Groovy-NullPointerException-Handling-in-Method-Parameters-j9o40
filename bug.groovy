```groovy
def foo(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println foo(1,2)
println foo(null,2)
println foo(1,null)
println foo(null,null) 
```