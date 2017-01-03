package com.anteoy.coreScala

/**
  * Created by zhoudazhuang 
  * Date: 17-1-3 
  * Time: 下午4:23
  * Description : 匿名函数 lambda
  * 右箭头‘=>’表明程序中存在一个匿名函数，箭头左边是匿名函数的参数列表，右边是函数体。在本例中，参数列表为空(箭头左边是一对空括号)，而函数体和改造前定义的timeFlies函数保持一致
  */
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true ) { callback(); Thread sleep 1000 }
  }

  def main(args: Array[String]) {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}
