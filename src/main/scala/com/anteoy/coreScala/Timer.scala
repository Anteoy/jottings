package com.anteoy.coreScala

/**
  * Created by zhoudazhuang 
  * Date: 17-1-3 
  * Time: 下午3:18 函数式编程 函数 参数 返回值 回调
  * Description :下面的程序将实现简单定时器的功能，负责定时的函数（function）名为：oncePerSecond，它接受一个回调函数作为参数，该回调函数的类型记为：() => Unit，代表任何无参数、无返回值的函数（Unit和C/C++中的void类似）。程序的main方法调用定时函数，作为实参传进去的回调函数timeFlies，仅仅向终端打印一句话，所以，该程序的实际功能是：每秒钟在屏幕上打印一条信息：time ﬂies like an arrow。
  */
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  def timeFlies() {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
