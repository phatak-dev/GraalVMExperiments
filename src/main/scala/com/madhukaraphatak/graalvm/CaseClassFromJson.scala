package com.madhukaraphatak.graalvm

import org.graalvm.polyglot.Context

object CaseClassFromJson {

  def main(args: Array[String]): Unit = {

    val context = Context.create()

    case class Person(name:String, age:Int)

    val result = context.eval("js","({ 'name':'John', 'age':20})")

    val person = Person(result.getMember("name").asString(), result.getMember("age").asInt())

    println(person)



  }


}
