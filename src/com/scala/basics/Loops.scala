package com.scala.basics

object Loops extends App {

  /*
   * i++ and ++i as in Java is not allowed in Scala
   *
   * semicolon at the end of the statement is optional
   */
  def method() = {
    var i = 0
    while (i < 5) {
      println(i);
      i += 1;
    }
  }
  method()
}
