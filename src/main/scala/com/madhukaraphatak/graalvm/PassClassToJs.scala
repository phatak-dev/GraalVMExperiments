package com.madhukaraphatak.graalvm

import org.graalvm.polyglot.Context

object PassClassToJs {

  def main(args: Array[String]): Unit = {

    val context = Context.newBuilder().allowAllAccess(true).build()

    case class Person(name:String, age:Int)

    val person = Person("John",20)

    context.getBindings("js").putMember("person",person)

    val result = context.eval("js","person.name() == 'John' && person.age() == 20").asBoolean()

    println(result)



  }


}
