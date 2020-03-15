package com.madhukaraphatak.graalvm

import org.graalvm.polyglot._


object JavaScriptHelloWolrd {
  def main(args: Array[String]): Unit = {
    val polyglot = Context.create()
    polyglot.eval("js","print('hello world from javascript')")
  }
}


