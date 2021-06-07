package com.scala.basics

object Variables extends App {
  /* Scala has 2 kinds of variables
   *   1. val - constant and cannot be reassigned. It's like final field in Java.
   *   2. var - can be reassigned. It's like non-final field in Java.
   *
   *    type-inference: if user doesn't mention the type of the variable, Scala will figure out the type.
   */

  val msg = "Welcome to Scala language"
  // this will be compiler error - reassignment to val
  //msg = "the text is modified"
  println(msg)

  var newMsg = "This message can be modified or reassigned"
  newMsg = "Modified message"
  println(newMsg)

  // user can mention the type of the variable as well
  var message: String = "Scala Version: "
  var version: Int = 2
  var currentVersion = "2.13.2"
  println(message + currentVersion)
}
