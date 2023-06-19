# Java Operators

This section provides a comprehensive explanation of Java operators, covering various categories, including arithmetic, assignment, comparison, logical, bitwise, and more.

## Arithmetic Operators

Arithmetic operators are used to perform mathematical calculations on numerical values.

- Addition (`+`): Adds two operands.
- Subtraction (`-`): Subtracts the second operand from the first.
- Multiplication (`*`): Multiplies two operands.
- Division (`/`): Divides the first operand by the second.
- Modulus (`%`): Returns the remainder of the division.
- Increment (`++`): Increments the value by 1.
- Decrement (`--`): Decrements the value by 1.

## Assignment Operators

Assignment operators are used to assign values to variables.

- Simple Assignment (`=`): Assigns the value on the right to the variable on the left.
- Compound Assignment (`+=`, `-=`, `*=`, `/=`, `%=`): Performs the specified operation and assigns the result to the variable.

## Comparison Operators

Comparison operators are used to compare values and return a boolean result (`true` or `false`).

- Equal to (`==`): Returns `true` if the operands are equal.
- Not equal to (`!=`): Returns `true` if the operands are not equal.
- Greater than (`>`): Returns `true` if the left operand is greater than the right.
- Less than (`<`): Returns `true` if the left operand is less than the right.
- Greater than or equal to (`>=`): Returns `true` if the left operand is greater than or equal to the right.
- Less than or equal to (`<=`): Returns `true` if the left operand is less than or equal to the right.

## Logical Operators

Logical operators are used to perform logical operations on boolean values.

- Logical AND (`&&`): Returns `true` if both operands are `true`.
- Logical OR (`||`): Returns `true` if at least one of the operands is `true`.
- Logical NOT (`!`): Returns the opposite boolean value.

## Bitwise Operators

Bitwise operators perform operations on individual bits of integer types.

- Bitwise AND (`&`): Performs bitwise AND operation.
- Bitwise OR (`|`): Performs bitwise OR operation.
- Bitwise XOR (`^`): Performs bitwise exclusive OR operation.
- Bitwise complement (`~`): Flips the bits of the operand.
- Left shift (`<<`): Shifts the bits of the operand to the left.
- Right shift (`>>`): Shifts the bits of the operand to the right with sign extension.
- Unsigned right shift (`>>>`): Shifts the bits of the operand to the right without sign extension.

## Ternary Operator

The ternary operator (`?:`) is a shorthand way of writing an `if-else` statement in a single line.

```java
int result = (condition) ? value1 : value2;
```

If the condition is true, value1 is assigned to result; otherwise, value2 is assigned.

## Operator Precedence

Operator precedence determines the order in which operators are evaluated in an expression. It ensures that expressions are evaluated correctly according to the intended logic. 

In Java, operators with higher precedence are evaluated before operators with lower precedence. If multiple operators have the same precedence, the evaluation order is determined by their associativity (left-to-right or right-to-left).

To control the order of evaluation, parentheses `()` can be used. Expressions within parentheses are evaluated first.

For the complete list and order of precedence for Java operators, refer to the [Java Operator Precedence Table](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html).

