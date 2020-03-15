package com.madhukaraphatak.graalvm

import org.graalvm.polyglot.Context

object CallingFunctions {

  def main(args: Array[String]): Unit = {

    val context = Context.create()

    val function =  context.eval("js","x => 'hello '+x")

    println(function.execute("world").asString())


  }

}
