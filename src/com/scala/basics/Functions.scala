package com.scala.basics

object Functions extends App {

  /*
   * function name starts with def keyword and followed by function name (here it's max)
   * function parameters are not infer by Scala Compiler
   * 3rd Int is result type. In Java, it's called return type
   *
   * the below if else expression behaves like Java's Ternary operator
   *
   * = sign that precedes the body of a function behaves as Functional programming
   *
   * the result type can be left off, but it's good idea to indicate function type explicitly
   */
  def max(x: Int, y: Int): Int = {
    if (x > y)
      x
    else
      y
  }

  //alternative write function like below since there is just one statement
  def min(x: Int, y: Int): Int = if (x < y) x else y

  /* Function that takes no parameters and returns no result
   * :Unit is the result type, which returns nothing. It's similar to Java's void type
   */
  def greetings() = println("Welcome to Scala Functions")

  val maximum = max(10, 20)
  val minimum = min(10, 20)
  println(maximum)
  println(minimum)
  greetings()
}
