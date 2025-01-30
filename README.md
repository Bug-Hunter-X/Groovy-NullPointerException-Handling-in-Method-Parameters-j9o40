# Groovy NullPointerException Handling in Method Parameters

This repository demonstrates an uncommon error in Groovy related to handling null values in method parameters.  The `foo` method, while seemingly simple, exhibits unexpected behavior when null is passed as an argument.

## The Problem

The Groovy code in `bug.groovy` shows a method that performs addition of two numbers. However, it lacks proper null handling. When null values are passed, it fails without a clear, user-friendly error message. This leads to unexpected behavior instead of a more informative exception.

## The Solution

The `bugSolution.groovy` file provides a corrected version of the `foo` method. The improved method explicitly checks for null values and handles them appropriately (in this example, returning null). This ensures more predictable and robust code behavior.

## How to reproduce

1. Clone this repository
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`)
3. Observe the output and unexpected behavior.
4. Run `bugSolution.groovy` using a Groovy interpreter. Observe the improved output.
